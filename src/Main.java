import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("=== SISTEMA DUOC ===");
            System.out.println("1. Mostrar estado");
            System.out.println("2. Procesar operación");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Sistema operativo.");
            } else if (opcion == 2) {
                System.out.println("Procesando operación...");
            } else if (opcion == 0) {
                System.out.println("Cerrando sistema...");
            }

        }
            for (int i = 1; i <= 2; i++) {
                System.out.println("Procesando estudiante" + 1);
            }


        Estudiante estudiante = new Estudiante(

                "Ana",
                "Ingeniería en Informática",
                20
        );

        estudiante.mostrarInformacion();
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
        estudiante.mostrarInformacion();


        Dispositivo dispositivo = new Dispositivo("Notebook hp", true);
        dispositivo.mostrarEstado();
        dispositivo.ejecutarDiagnostico();

    }
}