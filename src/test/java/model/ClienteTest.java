package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {

    private Cliente cliente;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        cliente = new Cliente();
    }

    @After
    public void tearDown() {
        cliente = null;
    }

    @Test
    public void testGettersAndSetters() {
        // Arrange
        int idEsperado = 1;
        String nomeEsperado = "Henrique Konrad";
        String documentoEsperado = "12345678901";
        String telefoneEsperado = "51999999999";
        String enderecoEsperado = "Avenida n sei, 123";

        // Act
        cliente.setId(idEsperado);
        cliente.setNome(nomeEsperado);
        cliente.setDocumento(documentoEsperado);
        cliente.setTelefone(telefoneEsperado);
        cliente.setEndereco(enderecoEsperado);

        // Assert
        assertEquals(idEsperado, cliente.getId());
        assertEquals(nomeEsperado, cliente.getNome());
        assertEquals(documentoEsperado, cliente.getDocumento());
        assertEquals(telefoneEsperado, cliente.getTelefone());
        assertEquals(enderecoEsperado, cliente.getEndereco());
    }

    @Test
    public void testToString() {
        // Arrange
        cliente.setNome("Maria");
        cliente.setDocumento("98765432100");
        cliente.setTelefone("51988887777");
        cliente.setEndereco("Av. Brasil, 500");

        // Act
        String esperado = "Maria;98765432100;51988887777;Av. Brasil, 500";
        String obtido = cliente.toString();

        // Assert
        assertEquals(esperado, obtido);
    }

    @Test
    public void testValoresPadraoSaoNull() {
        // Assert
        assertNull(cliente.getNome());
        assertNull(cliente.getDocumento());
        assertNull(cliente.getTelefone());
        assertNull(cliente.getEndereco());
    }
    @Test
    public void testIdPadraoEhZero() {
        // Arrange — nenhum set

        // Act
        int idObtido = cliente.getId();

        // Assert
        assertEquals(0, idObtido);
    }

    @Test
    public void testSetNomeVazio() {
        // Arrange
        String nomeVazio = "";

        // Act
        cliente.setNome(nomeVazio);

        // Assert
        assertEquals("", cliente.getNome());
    }
    
}