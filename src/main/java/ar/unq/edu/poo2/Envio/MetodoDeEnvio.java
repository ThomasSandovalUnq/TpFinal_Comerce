package ar.unq.edu.poo2.Envio;

import ar.unq.edu.poo2.Pedido.Pedido;

public interface MetodoDeEnvio {
	
    float calcularCosto(Pedido pedido);
    int estimarDiasDeEntrega(Pedido pedido);
}
