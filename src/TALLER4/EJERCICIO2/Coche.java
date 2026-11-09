package TALLER4.EJERCICIO2;

public class Coche {
    // 1. Propiedades privadas
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    // Constructor
    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima > 0 ? velocidadMaxima : 0;
    }

    // Getters para consultar los datos de forma segura
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    // 2. Método acelerar con validación de incremento positivo
    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
            System.out.println("Velocidad incrementada. Nueva velocidad máxima: " + this.velocidadMaxima + " km/h");
        } else {
            System.out.println("Error: El incremento debe ser positivo.");
        }
    }
}
