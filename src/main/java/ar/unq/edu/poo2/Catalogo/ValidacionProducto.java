package ar.unq.edu.poo2.Catalogo;

public class ValidacionProducto extends RuntimeException {

	public ValidacionProducto(String mensaje) {
        super(mensaje);
    }
}
