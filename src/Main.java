import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            System.out.println("Procesando estudiante" + 1);
        }
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

        if (edad >= 18) {
            System.out.println("Acceso Autorizado");
        } else {
            System.out.println("Acceso Restringido");
        }

        if (edad < 18) {
            System.out.println("Estudiante menor de edad");
        } else if (edad < 25 ) {
            System.out.println("Estudiante joven");
        } else {
            System.out.println("Estudiante adulto");
        }
        Estudiante.mostrarInformacion();


    }
}