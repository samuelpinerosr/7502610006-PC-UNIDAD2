package TALLER6.Ejercicio1;

public class Empleado {
    // 1. Propiedades con acceso protegido (protected)
    protected String nombre;
    protected double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método para mostrar información base
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}