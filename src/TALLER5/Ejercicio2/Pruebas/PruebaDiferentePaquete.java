package TALLER5.Ejercicio2.Pruebas;


// Intentamos importar la clase (Si la clase Vehiculo no es public, ni siquiera se puede importar)
// import vehiculos.Vehiculo;

import TALLER5.Ejercicio2.Vehiculos.Moto;

public class PruebaDiferentePaquete {
    public static void main(String[] args) {

        // --- INTENTOS Y ERRORES DE COMPILACIÓN ---

        // Error 1: Si la clase Vehiculo tiene acceso package/default,
        // no es visible fuera del paquete 'vehiculos'.
        // Vehiculo v = new Vehiculo("Terrestre");
        // ERROR: vehiculos.Vehiculo is not public in vehiculos; cannot be accessed from outside package

        // Error 2: Moto es public, pero sus herencias de tipo package no se exponen aquí
        Moto m = new Moto("Deportiva", 600);

        // System.out.println(m.tipo);
        // ERROR: tipo is not public in vehiculos.Vehiculo; cannot be accessed from outside package
    }
}