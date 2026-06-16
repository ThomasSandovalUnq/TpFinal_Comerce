package ar.unq.edu.poo2.MetodoPago;

public abstract class MetodoPago {
	protected double monto; // preguntar si esta bien poner el atributo monto que sepa cuanto se gasto en un pedido 
	protected String codigoTransaccion;
	
	public MetodoPago(double monto) {
		this.monto = monto;
	}

	public void procesarPago() {
		validarDatos();
		reservarFondos();
		ejecutarTransaccion();
		notificarResultado();
	}

	protected  void notificarResultado() {  
		System.out.println("Transacción registrada: "
	            + this.codigoTransaccion); // preguntar sobe como debemos notificar 
	}

	protected abstract void ejecutarTransaccion();

	protected abstract void reservarFondos();

	protected abstract void validarDatos();
}
