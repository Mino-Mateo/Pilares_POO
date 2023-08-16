package Polimorfismo;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void sonido() {
        System.out.println("El "+getName() + " hace Woof!");
    }
}