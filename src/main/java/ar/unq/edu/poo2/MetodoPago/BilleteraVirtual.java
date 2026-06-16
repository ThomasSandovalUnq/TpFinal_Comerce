package ar.unq.edu.poo2.MetodoPago;

public class BilleteraVirtual extends MetodoPago {

    private double saldo;

    private ApiBilleteraVirtual api;

    public BilleteraVirtual(
            double monto,
            double saldo,
            ApiBilleteraVirtual api) {

        super(monto);

        this.setSaldo(saldo);
        this.api = api;
    }

    @Override
    protected void validarDatos() {

        if (!api.tieneSaldo(monto)) {
            throw new RuntimeException("Saldo insuficiente");
        }
    }
    @Override
    protected void reservarFondos() {
        api.bloquearSaldo(monto);
    }
    @Override
    protected void ejecutarTransaccion() {

        codigoTransaccion =
                api.acreditar(monto);
    }

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    // Usa la implementación por defecto de notificarResultado()
}
