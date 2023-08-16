package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Perro("Willfrido");
        Animal cat = new Gato("Chispitas");

        animalSound(dog);
        animalSound(cat);
    }

    public static void animalSound(Animal animal) {
        animal.sonido();
    }
}