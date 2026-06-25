package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustoTest {

    private Custo custo;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        custo = new Custo();
    }

    @After
    public void tearDown() {
        custo = null;
    }

    @Test
    public void testGettersAndSetters() {
        // Arrange
        int idEsperado = 5;
        double valorEsperado = 150.75;
        Producao producaoEsperada = new Producao();
        TipoCusto tipoCustoEsperado = new TipoCusto();
        // Act
        custo.setId(idEsperado);
        custo.setValor(valorEsperado);
        custo.setProducao(producaoEsperada);
        custo.setTipoCusto(tipoCustoEsperado);
        // Assert
        assertEquals(idEsperado, custo.getId());
        assertEquals(valorEsperado, custo.getValor(), 0.001);
        assertEquals(producaoEsperada, custo.getProducao());
        assertEquals(tipoCustoEsperado, custo.getTipoCusto());
    }
}