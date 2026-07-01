package ar.unq.edu.poo2.Envio;

import ar.unq.edu.poo2.Pedido.Pedido;

public class EnvioEstandar implements MetodoDeEnvio {
    private Direccion direccionDestino; // Clase ficticia (o String)
    private CorreoArgentina correo;     // La librería que te da el enunciado
    public EnvioEstandar(Direccion direccion, CorreoArgentina correo) {
        this.direccionDestino = direccion;
        this.correo = correo;
    }
    @Override
    public float calcularCosto(Pedido pedido) {
        // Le pedimos al Pedido que calcule su propio peso total
        float pesoTotal = pedido.getPesoTotal(); 
        return this.correo.estimarEnvio(pesoTotal, this.direccionDestino);
    }
    @Override
    public int estimarDiasDeEntrega(Pedido pedido) {
        return 7; // El enunciado dice "fija entre 5 y 7 días"
    }
}