/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.DAO;

import apoio.ConexaoBD;
import model.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteDAOTest {
    
    private static final String SQL_CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS cliente ( " +
            "  id_cliente  SERIAL PRIMARY KEY, " +
            "  nome        VARCHAR(100) NOT NULL, " +
            "  documento   VARCHAR(20)  NOT NULL, " +
            "  telefone    VARCHAR(20)  NOT NULL, " +
            "  endereco    VARCHAR(200) NOT NULL " +
            ");";

    private static final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS cliente;";

    private ClienteDAO dao;

    @BeforeClass
    public static void setUpClass() {
        try {
            System.setProperty("db.config", "db-test.properties");
            ConexaoBD.executeUpdate(SQL_CREATE_TABLE);
        } catch (SQLException e) {
            throw new RuntimeException("Erro em @BeforeClass: falha ao criar tabela 'cliente'.\n" + e.getMessage(), e);
        }
    }

    @AfterClass
    public static void tearDownClass() {
        try {
            ConexaoBD.executeUpdate(SQL_DROP_TABLE);
        } catch (SQLException e) {
            throw new RuntimeException("Erro em @AfterClass: falha ao dropar tabela 'cliente'.\n" + e.getMessage(), e);
        }
    }

    @Before
    public void setUp() {
        ConexaoBD.getInstance().shutdown();
        dao = new ClienteDAO();
        try {
            ConexaoBD.executeUpdate("TRUNCATE TABLE cliente RESTART IDENTITY;");
        } catch (SQLException e) {
            throw new RuntimeException("Erro em @Before: falha ao truncar tabela 'cliente'.\n" + e.getMessage(), e);
        }
    }

    @After
    public void tearDown() {
        ConexaoBD.getInstance().shutdown();
    }
    
    @Test
    public void testInserirERecuperarCliente() throws SQLException {
        
        // 1) Cria objeto e insere no banco

        Cliente c = new Cliente();
        c.setNome("Henrique Konrad");
        c.setDocumento("12345678901");
        c.setTelefone("51999999999");
        c.setEndereco("Avenida n sei, 123");
        dao.salvar(c);
        
        // 2) Recupera todos, deve haver 1

        ArrayList<Cliente> lista = dao.recuperarTodos();
        assertNotNull("Lista não deve ser nula", lista);
        assertEquals("Deve haver exatamente 1 cliente na tabela", 1, lista.size());
            
        // 3) Recupera por ID e valida os dados
        Cliente recuperado = dao.recuperarUm(1);
        assertNotNull("recuperarUm(id) não deve retornar null", recuperado);
        assertEquals(1, recuperado.getId());
        assertEquals(c.getNome(), recuperado.getNome());
        assertEquals(c.getDocumento(), recuperado.getDocumento());
        assertEquals(c.getTelefone(), recuperado.getTelefone());
        assertEquals(c.getEndereco(), recuperado.getEndereco());
    }

    @Test
    public void testEditarCliente() throws SQLException {
        
        // 1) Insere um registro inicial
        Cliente c = new Cliente();
        c.setNome("Maria Silva");
        c.setDocumento("98765432100");
        c.setTelefone("51988887777");
        c.setEndereco("Av. Brasil, 500");
        dao.salvar(c);
        
        // 2) Edita com novos dados
        Cliente modificado = new Cliente();
        modificado.setId(1);
        modificado.setNome("Maria Silva Modificada");
        modificado.setDocumento("98765432100");
        modificado.setTelefone("51911112222");
        modificado.setEndereco("Rua das Flores, 10");
        dao.editar(modificado);
        
        // 3) Recupera e valida os campos atualizados
        Cliente recuperado = dao.recuperarUm(1);
        assertNotNull("Cliente com ID 1 deveria existir após edição", recuperado);
        assertEquals(1, recuperado.getId());
        assertEquals("Maria Silva Modificada", recuperado.getNome());
        assertEquals("98765432100", recuperado.getDocumento());
        assertEquals("51911112222", recuperado.getTelefone());
        assertEquals("Rua das Flores, 10", recuperado.getEndereco());
    }

    @Test
    public void testExcluirCliente() throws SQLException {
        // 1) Insere um registro
        Cliente c = new Cliente();
        c.setNome("João Santos");
        c.setDocumento("11122233344");
        c.setTelefone("51933334444");
        c.setEndereco("Rua XV, 200");
        dao.salvar(c);

        // Confirma que existe antes da exclusão
        Cliente antes = dao.recuperarUm(1);
        assertNotNull("Cliente com ID 1 deveria existir antes da exclusão", antes);

        // 2) Exclui o cliente de ID = 1
        dao.excluir(1);

        // 3) Verifica que recuperarUm(1) retorna null
        Cliente depois = dao.recuperarUm(1);
        assertNull("recuperarUm(1) deve retornar null após exclusão", depois);

        // 4) Verifica que recuperarTodos() retorna lista vazia
        ArrayList<Cliente> todos = dao.recuperarTodos();
        assertNotNull("Lista retornada por recuperarTodos não deve ser null", todos);
        assertTrue("Lista deve estar vazia após exclusão do cliente", todos.isEmpty());
    }

    @Test
    public void testRecuperarTodosComMultiplosClientes() throws SQLException {
        // 1) Insere 3 clientes
        String[] nomes = {"Ana", "Bruno", "Carlos"};
        for (String nome : nomes) {
            Cliente c = new Cliente();
            c.setNome(nome);
            c.setDocumento("00000000000");
            c.setTelefone("51900000000");
            c.setEndereco("Rua Teste, 1");
            dao.salvar(c);
        }

        // 2) Recupera todos e valida
        ArrayList<Cliente> lista = dao.recuperarTodos();
        assertNotNull("Lista não deve ser nula", lista);
        assertEquals("Deve haver exatamente 3 clientes na tabela", 3, lista.size());
    }
}
