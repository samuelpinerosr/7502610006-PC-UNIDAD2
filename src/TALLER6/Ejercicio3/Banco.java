package TALLER6.Ejercicio3;

public class Banco {

    private double saldo;

    public Banco(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {

        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {

        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Retiro no válido.");
        }
    }
}

/*
public class Banco {

    protected double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }
}

 */