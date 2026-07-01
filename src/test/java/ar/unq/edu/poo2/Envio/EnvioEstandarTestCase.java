package ar.unq.edu.poo2.Envio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import ar.unq.edu.poo2.Pedido.Pedido;

@ExtendWith(MockitoExtension.class)
public class EnvioEstandarTestCase {

    private EnvioEstandar envio;

    @Mock
    private Direccion direccionMock;
    
    @Mock
    private CorreoArgentina correoMock;

    @Mock
    private Pedido pedidoMock;

    @BeforeEach
    public void setUp() {
        envio = new EnvioEstandar(direccionMock, correoMock);
    }

    @Test
    public void testCalcularCosto() {
        when(pedidoMock.getPesoTotal()).thenReturn(5.5f);
        when(correoMock.estimarEnvio(5.5f, direccionMock)).thenReturn(1500.0f);

        float costo = envio.calcularCosto(pedidoMock);

        assertEquals(1500.0f, costo);
    }

    @Test
    public void testEstimarDiasDeEntrega() {
        int dias = envio.estimarDiasDeEntrega(pedidoMock);
        assertEquals(7, dias);
    }
}
