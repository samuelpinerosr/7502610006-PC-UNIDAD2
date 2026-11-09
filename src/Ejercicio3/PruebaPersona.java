package Ejercicio3;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Laura", 25);

        // 1. Atributo 'edad' (default): SE PUEDE acceder directamente en el mismo paquete
        System.out.println("Edad inicial: " + p.edad);
        p.edad = 26; // Modificación directa permitida
        System.out.println("Nueva edad: " + p.edad);

        // 2. Atributo 'nombre' (private): NO SE PUEDE acceder directamente
        // System.out.println(p.nombre);
        // ERROR DE COMPILACIÓN: nombre has private access in Ejercicio3.Persona

        // Se debe usar obligatoriamente su getter/setter public
        System.out.println("Nombre: " + p.getNombre());
        p.setNombre("Laura Sofía");
    }
}