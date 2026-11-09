package TALLER6.Ejercicio3;

public class BancoHijo extends Banco {

    public BancoHijo(double saldo) {
        super(saldo);
    }

}
/*
sería peligroso porque una clase hija podría modificar
directamente el saldo del banco, lo que podría llevar a inconsistencias
en los datos y problemas de seguridad.
 */