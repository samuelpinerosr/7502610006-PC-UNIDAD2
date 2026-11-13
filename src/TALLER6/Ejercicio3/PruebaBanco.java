package TALLER6.Ejercicio3;

public class PruebaBanco {
    public static void main(String[] args) {
        // Caso inseguro: permite corrupción de datos desde el mismo paquete
        BancoInseguro cuentaMala = new BancoInseguro(1000.0);
        cuentaMala.saldo = -9999.0; // Java lo permite sin control porque es protected
        System.out.println("Saldo en BancoInseguro (corrupto): $" + cuentaMala.saldo);

        System.out.println("-----------------------------------");

        // Caso seguro: protege el saldo con private y métodos validados
        BancoSeguro cuentaBuena = new BancoSeguro(1000.0);
        // cuentaBuena.saldo = -9999.0; // Error de compilación: saldo es private
        cuentaBuena.depositar(500.0);
        cuentaBuena.retirar(2000.0); // Bloqueado por validación
        System.out.println("Saldo final en BancoSeguro: $" + cuentaBuena.getSaldo());
    }
}
