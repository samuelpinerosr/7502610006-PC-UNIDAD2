package TALLER5.Ejercicio1;

class Producto {
    // 1. Atributos con acceso de paquete (default)
    String nombre;
    double precio;
    int stock;

    // 2. Constructor con acceso de paquete
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // 3. Método con acceso de paquete
    void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " unidades");
    }
}