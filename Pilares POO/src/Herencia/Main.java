package Herencia;

public class Main {
    public static void main(String[] args) {
        Gerente nuevogerente = new Gerente("Alice", 6000, "Ventas");
        Desarrollador nuevodesarrollador = new Desarrollador("Bob", 5000, "Java");

        nuevogerente.trabajo();
        nuevogerente.gestion();
        nuevogerente.MostrarSueldo();

        nuevodesarrollador.trabajo();
        nuevodesarrollador.code();
        nuevodesarrollador.MostrarSueldo();
    }
}