package Encapsulación;

public class Main {
    public static void main(String[] args) {
        Estudiante student = new Estudiante();
        student.setName("John");
        student.setAge(20);

        System.out.println("Nombre del Estudiante: " + student.getName());
        System.out.println("Edad del Estudiante: " + student.getAge());
    }
}
