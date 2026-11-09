package TALLER4.EJERCICIO2;

public class PruebaCoche {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla", 180.0);

        // Uso correcto a través del método público
        miCoche.acelerar(20.0);

        // 3. INTENTO DE ACCESO DIRECTO (Descomentar para ver el error de compilación):
        // System.out.println(miCoche.marca);            // Error de compilación: marca tiene acceso privado en Coche
        // System.out.println(miCoche.modelo);           // Error de compilación: modelo tiene acceso privado en Coche
        // miCoche.velocidadMaxima = 250.0;             // Error de compilación: velocidadMaxima tiene acceso privado en Coche
    }
}