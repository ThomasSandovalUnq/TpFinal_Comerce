package ar.unq.edu.poo2.Catalogo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CatalogoPesoTestCase {
    
    private Producto productoConPeso;
    private Producto productoSinPeso;
    
    @BeforeEach
    public void setUp() {
        productoConPeso = new Producto("Auriculares", "Bluetooth", 8000, "SKU1", "Sony", "Audio", 0);
        productoConPeso.agregarAtributoDinamico("Peso", 1.5f);
        productoSinPeso = new Producto("Licencia Antivirus", "Anual", 5000, "SKU2", "Avast", "Software", 0);
    }
    
    @Test
    public void testProductoConPesoDevuelveSuValorExacto() {
        assertEquals(1.5f, productoConPeso.getPeso());
    }
    
    @Test
    public void testProductoSinPesoRegistradoDevuelveCero() {
        assertEquals(0.0f, productoSinPeso.getPeso());
    }
}
