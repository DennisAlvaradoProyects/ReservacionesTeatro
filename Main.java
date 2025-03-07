import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorBoletos gestor = new GestorBoletos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Sistema de Reservaciones de Boletos ---");
            System.out.println("1. Registrar reservación");
            System.out.println("2. Eliminar reservación");
            System.out.println("3. Verificar asiento ocupado");
            System.out.println("4. Mostrar reservaciones");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el número de asiento: ");
                    int numeroAsiento = scanner.nextInt();
                    gestor.registrarReservacion(nombre, numeroAsiento);
                    break;
                case 2:
                    System.out.print("Ingrese el número de asiento a cancelar: ");
                    int asientoCancelar = scanner.nextInt();
                    gestor.eliminarReservacion(asientoCancelar);
                    break;
                    case 3:
                    System.out.print("Ingrese el número de asiento a verificar: ");
                    int asientoVerificar = scanner.nextInt();
                    if (gestor.verificarAsientoOcupado(asientoVerificar)) {
                        System.out.println("Asiento " + asientoVerificar + " ocupado.");
                    } else {
                        System.out.println("Asiento " + asientoVerificar + " disponible.");
                    }
                    break;
                case 4:
                    gestor.mostrarReservaciones();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}