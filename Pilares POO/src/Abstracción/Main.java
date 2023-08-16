package Abstracción;

import Abstracción.Carro;

public class Main {
    public static void main(String[] args) {
        Vehiculo carro = new Carro("Toyota", "Camry");
        Vehiculo moto = new Motocicleta("Honda", "CBR");

        carro.start();
        moto.start();
    }
}