import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(

                "Ana",
                "Ingeniería en Informática",
                20
        );

        Estudiante.mostrarInformacion();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese carrera");
        String carrera = scanner.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();

        Estudiante estudiante1 = new Estudiante(nombre, carrera, edad);


        Estudiante.mostrarInformacion();
    }
}