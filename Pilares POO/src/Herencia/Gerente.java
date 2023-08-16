package Herencia;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    public void gestion() {
        System.out.println(nombre + " está gestionando el " + departamento + " departamento");
    }
}