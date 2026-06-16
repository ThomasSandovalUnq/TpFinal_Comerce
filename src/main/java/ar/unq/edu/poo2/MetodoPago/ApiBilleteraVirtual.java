package ar.unq.edu.poo2.MetodoPago;

public interface ApiBilleteraVirtual {

    boolean tieneSaldo(double monto);

    void bloquearSaldo(double monto);

    String acreditar(double monto);
}
