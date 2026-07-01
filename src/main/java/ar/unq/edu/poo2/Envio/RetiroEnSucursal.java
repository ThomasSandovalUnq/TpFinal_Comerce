package ar.unq.edu.poo2.Envio;

import ar.unq.edu.poo2.Sucursal.Sucursal;
import ar.unq.edu.poo2.Pedido.LineaDePedido;
import ar.unq.edu.poo2.Pedido.Pedido;

public class RetiroEnSucursal implements MetodoDeEnvio {
	
    private Sucursal sucursalElegida;
    
    public RetiroEnSucursal(Sucursal sucursalElegida) {
        this.sucursalElegida = sucursalElegida;
    }
    
    @Override
    public float calcularCosto(Pedido pedido) {
        return 0.0f;
    }
    
    @Override
    public int estimarDiasDeEntrega(Pedido pedido) {
        int maxDias = 0;
        
        for (LineaDePedido linea : pedido.getLineas()) {
            int dias = this.sucursalElegida.estimarDiasDeRetiro(linea.getItem(), linea.getCantidad());
            if (dias > maxDias) {
                maxDias = dias;
            }
        }
        return maxDias;
    }
    
    public Sucursal getSucursalElegida() {
        return this.sucursalElegida;
    }
}