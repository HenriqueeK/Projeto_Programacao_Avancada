package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoTest {

    private Produto produto;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        produto = new Produto();
    }

    @After
    public void tearDown() {
        produto = null;
    }

    @Test
    public void testGettersAndSetters() {
        // Arrange
        int idEsperado = 1;
        String nomeEsperado = "Soja";
        String unidadeEsperada = "Kg";

        // Act
        produto.setId(idEsperado);
        produto.setNome(nomeEsperado);
        produto.setUnidade(unidadeEsperada);

        // Assert
        assertEquals(idEsperado, produto.getId());
        assertEquals(nomeEsperado, produto.getNome());
        assertEquals(unidadeEsperada, produto.getUnidade());
    }

    @Test
    public void testValoresPadraoSaoNull() {
        // Assert
        assertNull(produto.getNome());
        assertNull(produto.getUnidade());
    }
}