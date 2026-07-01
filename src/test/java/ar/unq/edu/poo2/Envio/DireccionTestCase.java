package ar.unq.edu.poo2.Envio;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class DireccionTestCase {

    @Test
    public void testCrearDireccion() {
        Direccion direccion = new Direccion("Av. Siempreviva 742");
        assertNotNull(direccion);
    }
}
