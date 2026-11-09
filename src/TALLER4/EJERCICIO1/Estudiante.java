package TALLER4.EJERCICIO1;

public class Estudiante {
    // 1. Propiedades privadas
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Constructor vacío
    public Estudiante() {
    }

    // Constructor con parámetros
    public Estudiante(String nombre, int edad, double notaPromedio) {
        setNombre(nombre);
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }

    // Getters y Setters con validaciones
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad < 120) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser un número positivo válido.");
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0.0 && notaPromedio <= 5.0) { // O de 0.0 a 10.0 según el sistema de notas
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("Error: La nota promedio debe estar entre 0.0 y 5.0.");
        }
    }
}