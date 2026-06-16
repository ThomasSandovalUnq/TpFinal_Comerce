package ar.unq.edu.poo2.MetodoPago;

public interface ApiTransferenciaBancaria {

    boolean validarCuenta(
            String cbu,
            String alias);

    String transferir(double monto);
}
