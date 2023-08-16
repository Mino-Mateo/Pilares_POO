package Polimorfismo;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void sonido();

    public String getName() {
        return nombre;
    }
}
