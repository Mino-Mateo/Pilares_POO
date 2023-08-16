package Abstracción;

public abstract class Vehiculo {
    private String brand;
    private String model;

    public Vehiculo(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public abstract void start();
}