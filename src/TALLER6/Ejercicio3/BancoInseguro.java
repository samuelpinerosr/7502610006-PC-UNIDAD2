package TALLER6.Ejercicio3;


// 1. Implementación INCORRECTA usando protected en datos sensibles
public class BancoInseguro {
    protected double saldo;

    public BancoInseguro(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    /*
     * DISCUSIÓN DE SEGURIDAD:
     * Declarar 'saldo' como protected es inseguro porque cualquier clase dentro
     * del mismo paquete o cualquier subclase puede modificar el dinero directamente
     * (por ejemplo, poner saldo = -5000) sin pasar por ninguna validación o registro.
     */
}
