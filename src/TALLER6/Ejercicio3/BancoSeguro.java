package TALLER6.Ejercicio3;


// 2. Solución CORRECTA aplicando encapsulamiento con private
public class BancoSeguro {
    private double saldo;

    public BancoSeguro(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Error: El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Error: Fondos insuficientes o monto inválido.");
        }
    }
}
