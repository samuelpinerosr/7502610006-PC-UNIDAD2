package TALLER4.EJERCICIO1;

public class PruebaEstudiante {
    public static void main(String[] args) {
        // Crear instancia del estudiante
        Estudiante estudiante1 = new Estudiante();

        // Asignar valores usando los setters (invocando validaciones)
        estudiante1.setNombre("Carlos Pérez");
        estudiante1.setEdad(20);
        estudiante1.setNotaPromedio(4.5);

        // Mostrar datos usando los getters
        System.out.println("--- Datos del Estudiante ---");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Nota Promedio: " + estudiante1.getNotaPromedio());

        // Prueba de validación con datos inválidos
        System.out.println("\n--- Probando Validaciones ---");
        estudiante1.setEdad(-5);          // Muestra mensaje de error
        estudiante1.setNotaPromedio(6.5); // Muestra mensaje de error
    }
}
