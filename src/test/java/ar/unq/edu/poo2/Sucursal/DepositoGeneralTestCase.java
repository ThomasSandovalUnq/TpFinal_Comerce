package ar.unq.edu.poo2.Sucursal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import ar.unq.edu.poo2.Catalogo.ItemCatalogo;

@ExtendWith(MockitoExtension.class)
public class DepositoGeneralTestCase {

    private DepositoGeneral deposito;

    @Mock
    private ItemCatalogo itemMock;

    @BeforeEach
    public void setUp() {
        deposito = new DepositoGeneral();
    }

    @Test
    public void testStockInicialVacio() {
        assertFalse(deposito.tieneStock(itemMock, 1));
    }

    @Test
    public void testRegistrarEIncrementarStock() {
        deposito.registrarStock(itemMock, 5);
        assertTrue(deposito.tieneStock(itemMock, 5));
        
        deposito.incrementarStock(itemMock, 3);
        assertTrue(deposito.tieneStock(itemMock, 8));
    }

    @Test
    public void testDecrementarStock() {
        deposito.registrarStock(itemMock, 5);
        deposito.decrementarStock(itemMock, 2);
        
        assertTrue(deposito.tieneStock(itemMock, 3));
        assertFalse(deposito.tieneStock(itemMock, 4));
    }

    @Test
    public void testDecrementarStockLanzaExcepcionSiEsInsuficiente() {
        deposito.registrarStock(itemMock, 1);
        
        assertThrows(RuntimeException.class, () -> deposito.decrementarStock(itemMock, 2));
    }
}
