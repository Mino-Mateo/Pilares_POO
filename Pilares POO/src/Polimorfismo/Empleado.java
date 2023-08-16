package Herencia;

public class Empleado {
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void trabajo() {
        System.out.println(nombre + " esta trabajando duro");
    }

    public void MostrarSueldo() {
        System.out.println(nombre + " el sueldo del trabajador es: $" + sueldo);
    }
}