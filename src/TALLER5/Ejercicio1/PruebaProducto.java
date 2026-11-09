package TALLER5.Ejercicio1;

public class PruebaProducto {
    public static void main(String[] args) {
        // 4. Instanciación y acceso directo desde el mismo paquete
        Producto p1 = new Producto("Laptop", 1200.50, 10);

        // Se pueden modificar directamente los atributos de paquete
        p1.stock = 8;

        // Se puede llamar al método de paquete
        System.out.println("--- Información del Producto ---");
        p1.mostrarInfo();
    }
}