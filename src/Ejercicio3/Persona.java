package Ejercicio3;

public class Persona {
    private String nombre; // Acceso Restringido (Solo esta clase)
    int edad;              // Acceso de Paquete (Cualquier clase en 'Ejercicio3')

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos Get/Set obligatorios para leer/modificar 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}