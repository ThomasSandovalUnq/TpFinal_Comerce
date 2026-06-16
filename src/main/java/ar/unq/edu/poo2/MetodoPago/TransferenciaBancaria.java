package ar.unq.edu.poo2.MetodoPago;

public class TransferenciaBancaria extends MetodoPago {

    private String cbu;
    private String alias;
    private ApiTransferenciaBancaria api;

    public TransferenciaBancaria(
            double monto,
            String cbu,
            String alias,
            ApiTransferenciaBancaria api) {

        super(monto);
        this.cbu = cbu;
        this.alias = alias;
        this.api = api;
    }
    @Override
    protected void validarDatos() {
        if (!api.validarCuenta(
                cbu,
                alias)) {
            throw new RuntimeException( "Cuenta inválida");
        }
    }
    @Override
    protected void reservarFondos() {
        // No aplica
    }
    @Override
    protected void ejecutarTransaccion() {
        codigoTransaccion =
                api.transferir(monto);
    }
    @Override
    protected void notificarResultado() {

        super.notificarResultado();
        System.out.println( //consultar sobre las notificaciones de pago, como modelarlas
                "Comprobante CBU generado");
    }
}