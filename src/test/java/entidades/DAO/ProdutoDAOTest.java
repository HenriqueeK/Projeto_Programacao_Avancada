package entidades.DAO;

import apoio.ConexaoBD;
import model.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoDAOTest {
    

    private static final String SQL_CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS produto ( " +
            "  id_produto  SERIAL PRIMARY KEY, " +
            "  nome        VARCHAR(100) NOT NULL, " +
            "  unidade     VARCHAR(20)  NOT NULL " +
            ");";

    private static final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS produto CASCADE;";

    private ProdutoDAO dao;

    @BeforeClass
    public static void setUpClass() {
        try {
            System.setProperty("db.config", "db-test.properties");
            ConexaoBD.executeUpdate(SQL_CREATE_TABLE);
        } catch (SQLException e) {
            throw new RuntimeException("Erro em @BeforeClass: falha ao criar tabela 'produto'.\n" + e.getMessage(), e);
        }
    }

    @AfterClass
    public static void tearDownClass() {
        try {
            ConexaoBD.executeUpdate(SQL_DROP_TABLE);
        } catch (SQLException e) {
            throw new RuntimeException("Erro em @AfterClass: falha ao dropar tabela 'produto'.\n" + e.getMessage(), e);
        }
    }

    @Before
    public void setUp() {
        ConexaoBD.getInstance().shutdown();
        dao = new ProdutoDAO();
        try {
            ConexaoBD.executeUpdate("TRUNCATE TABLE produto RESTART IDENTITY CASCADE;");
        } catch (SQLException e) {
            throw new RuntimeException("Erro em @Before: falha ao truncar tabela 'produto'.\n" + e.getMessage(), e);
        }
    }

    @After
    public void tearDown() {
        ConexaoBD.getInstance().shutdown();
    }

    @Test
    public void testInserirERecuperarProduto() throws SQLException {
        // 1) Cria objeto e insere no banco
        Produto p = new Produto();
        p.setNome("Soja");
        p.setUnidade("kg");
        dao.salvar(p);

        // 2) Recupera todos, deve haver 1
        ArrayList<Produto> lista = dao.recuperarTodos();
        assertNotNull("Lista não deve ser nula", lista);
        assertEquals("Deve haver exatamente 1 produto na tabela", 1, lista.size());

        // 3) Recupera por ID e valida os dados
        Produto recuperado = dao.recuperarUm(1);
        assertNotNull("recuperarUm(id) não deve retornar null", recuperado);
        assertEquals(1, recuperado.getId());
        assertEquals(p.getNome(), recuperado.getNome());
        assertEquals(p.getUnidade(), recuperado.getUnidade());
    }
    
    @Test
    public void testEditarProduto() throws SQLException {
        // 1) Insere um registro inicial
        Produto p = new Produto();
        p.setNome("Milho");
        p.setUnidade("kg");
        dao.salvar(p);

        // 2) Edita com novos dados
        Produto modificado = new Produto();
        modificado.setId(1);
        modificado.setNome("Milho Modificado");
        modificado.setUnidade("ton");
        dao.editar(modificado);

        // 3) Recupera e valida os campos atualizados
        Produto recuperado = dao.recuperarUm(1);
        assertNotNull("Produto com ID 1 deveria existir após edição", recuperado);
        assertEquals(1, recuperado.getId());
        assertEquals("Milho Modificado", recuperado.getNome());
        assertEquals("ton", recuperado.getUnidade());
    }

    @Test
    public void testExcluirProduto() throws SQLException {
        // 1) Insere um registro
        Produto p = new Produto();
        p.setNome("Trigo");
        p.setUnidade("kg");
        dao.salvar(p);

        // Confirma que existe antes da exclusão
        Produto antes = dao.recuperarUm(1);
        assertNotNull("Produto com ID 1 deveria existir antes da exclusão", antes);

        // 2) Exclui o produto de ID = 1
        dao.excluir(1);

        // 3) Verifica que recuperarUm(1) retorna null
        Produto depois = dao.recuperarUm(1);
        assertNull("recuperarUm(1) deve retornar null após exclusão", depois);

        // 4) Verifica que recuperarTodos() retorna lista vazia
        ArrayList<Produto> todos = dao.recuperarTodos();
        assertNotNull("Lista retornada por recuperarTodos não deve ser null", todos);
        assertTrue("Lista deve estar vazia após exclusão do produto", todos.isEmpty());
    }

    @Test
    public void testRecuperarTodosComMultiplosProdutos() throws SQLException {
        // 1) Insere 3 produtos
        String[] nomes = {"Soja", "Milho", "Trigo"};
        for (String nome : nomes) {
            Produto p = new Produto();
            p.setNome(nome);
            p.setUnidade("kg");
            dao.salvar(p);
        }

        // 2) Recupera todos e valida
        ArrayList<Produto> lista = dao.recuperarTodos();
        assertNotNull("Lista não deve ser nula", lista);
        assertEquals("Deve haver exatamente 3 produtos na tabela", 3, lista.size());
    }
}