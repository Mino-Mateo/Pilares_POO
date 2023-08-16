package Herencia;

public class Desarrollador extends Empleado {
    private String lenguaje;

    public Desarrollador(String nombre, double sueldo, String lenguaje) {
        super(nombre, sueldo);
        this.lenguaje = lenguaje;
    }

    public void code() {
        System.out.println(nombre + " programa usando el lenguaje " + lenguaje);
    }
}