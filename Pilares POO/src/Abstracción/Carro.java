package Abstracción;

public class Carro extends Vehiculo {
    public Carro(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println("Mostrando el vehiculo: " + getBrand() + " " + getModel());
    }
}