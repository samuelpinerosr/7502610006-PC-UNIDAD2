package TALLER6.Ejercicio1;

// 2. Hereda de Empleado
public class Gerente extends Empleado {
    private String departamento;

    // Constructor que invoca al superconstructor
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    // 3. Sobrescribir método mostrarInformacion
    @Override
    public void mostrarInformacion() {
        // Acceso directo a los atributos 'protected' de la clase padre
        System.out.println("--- Información del Gerente ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Departamento: " + departamento);
    }
}
