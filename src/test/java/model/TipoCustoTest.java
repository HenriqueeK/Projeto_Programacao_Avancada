package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TipoCustoTest {

    private TipoCusto tipoCusto;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        tipoCusto = new TipoCusto();
    }

    @After
    public void tearDown() {
        tipoCusto = null;
    }

    @Test
    public void testGettersAndSetters() {
        // Arrange
        int idEsperado = 3;
        String descricaoEsperada = "Combustível";
        double precoPadraoEsperado = 6.50;

        // Act
        tipoCusto.setId(idEsperado);
        tipoCusto.setDescricao(descricaoEsperada);
        tipoCusto.setPrecoPadrao(precoPadraoEsperado);

        // Assert
        assertEquals(idEsperado, tipoCusto.getId());
        assertEquals(descricaoEsperada, tipoCusto.getDescricao());
        assertEquals(precoPadraoEsperado, tipoCusto.getPrecoPadrao(), 0.001);
    }

}