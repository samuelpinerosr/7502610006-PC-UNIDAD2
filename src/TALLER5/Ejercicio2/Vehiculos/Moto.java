package TALLER5.Ejercicio2.Vehiculos;

// Moto está en el mismo paquete, por lo que SÍ puede heredar de Vehiculo
public class Moto extends Vehiculo {
    int cilindrada;

    public Moto(String tipo, int cilindrada) {
        super(tipo); // Accede al constructor de paquete de Vehiculo
        this.cilindrada = cilindrada;
    }
}
