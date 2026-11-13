package TALLER6.Ejercicio2.Prueba;

import TALLER6.Ejercicio2.Moto;

public class Main {

    public static void main(String[] args) {

        Moto moto = new Moto("Deportiva", "Yamaha", 600);
        moto.mostrarInformacion();

        //System.out.println(moto.tipo);
        //System.out.println(moto.marca);
    }
}
/*
Una clase hija como Moto puede utilizarlos, pero una clase no relacionada no puede acceder directamente a ellos cuando están en otro paquete.
 */