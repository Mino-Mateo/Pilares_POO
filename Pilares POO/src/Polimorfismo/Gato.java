package Polimorfismo;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void sonido() {
        System.out.println("El "+getName() + " hace Meow!");
    }
}