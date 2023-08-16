package Abstracción;

public class Motocicleta extends Vehiculo {
    public Motocicleta (String brand, String model) {
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println("Mostrando la motocicleta: " + getBrand() + " " + getModel());
    }
}