package TALLER4.EJERCICIO3;

public class DemostracionError {
    public static void main(String[] args) {
        CuentaPrueba cuenta = new CuentaPrueba();

        // Intento de acceso directo:
       System.out.println(cuenta.claveSecreta);

        /*
         * ERROR AL COMPILAR EN JAVA:
         * "claveSecreta has private access in CuentaPrueba"
         *
         * Explicación: Al declarar un miembro como private, Java prohíbe
         * estrictamente su lectura o modificación desde cualquier clase distinta.
         */
    }
}