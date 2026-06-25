package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProducaoTest {

    private Producao producao;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        producao = new Producao();
    }

    @After
    public void tearDown() {
        producao = null;
    }

    @Test
    public void testGettersAndSetters() {
        // Arrange
        Produto produto = new Produto();
        produto.setId(1);
        produto.setNome("Soja");

        Safra safra = new Safra();
        safra.setId(1);
        safra.setNome("Safra 2025");

        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNome("João");

        // Act
        producao.setId(1);
        producao.setProduto(produto);
        producao.setSafra(safra);
        producao.setCliente(cliente);
        producao.setDataInicio("01/01/2025");
        producao.setDataFim("30/06/2025");
        producao.setQuantidade(100.0);
        producao.setPrecoUnitario(50.0);

        // Assert
        assertEquals(1, producao.getId());
        assertEquals("Soja", producao.getProduto().getNome());
        assertEquals("Safra 2025", producao.getSafra().getNome());
        assertEquals("João", producao.getCliente().getNome());
        assertEquals("01/01/2025", producao.getDataInicio());
        assertEquals("30/06/2025", producao.getDataFim());
        assertEquals(100.0, producao.getQuantidade(), 0.001);
        assertEquals(50.0, producao.getPrecoUnitario(), 0.001);
    }
}