package TALLER6.Ejercicio3;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco(500000);
        System.out.println("Saldo inicial: $" + banco.getSaldo());
        banco.depositar(200000);
        System.out.println("Después del depósito: $" + banco.getSaldo());
        banco.retirar(100000);
        System.out.println("Después del retiro: $" + banco.getSaldo());

        // Esto NO está permitido:
        // banco.saldo = -5000000;
    }
}
/*
protected facilita la herencia, mientras que private ofrece un mayor nivel de encapsulamiento y protección de los datos.
 */