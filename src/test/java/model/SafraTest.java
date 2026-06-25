package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SafraTest {

    private Safra safra;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        safra = new Safra();
    }

    @After
    public void tearDown() {
        safra = null;
    }

    @Test
    public void testGettersAndSetters() {
        // Arrange
        int idEsperado = 1;
        String nomeEsperado = "Safra 2025";
        String descricaoEsperada = "Safra de verão";
        String dataInicioEsperada = "01/01/2025";
        String dataFimEsperada = "30/06/2025";

        // Act
        safra.setId(idEsperado);
        safra.setNome(nomeEsperado);
        safra.setDescricao(descricaoEsperada);
        safra.setDataInicio(dataInicioEsperada);
        safra.setDataFim(dataFimEsperada);

        // Assert
        assertEquals(idEsperado, safra.getId());
        assertEquals(nomeEsperado, safra.getNome());
        assertEquals(descricaoEsperada, safra.getDescricao());
        assertEquals(dataInicioEsperada, safra.getDataInicio());
        assertEquals(dataFimEsperada, safra.getDataFim());
    }

}