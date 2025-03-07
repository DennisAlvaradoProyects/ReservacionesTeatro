import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;

public class GestorBoletos {
    private Queue<Reservacion> reservaciones;
    private HashMap<Integer, String> asientosOcupados;

    public GestorBoletos() {
        this.reservaciones = new LinkedList<>();
        this.asientosOcupados = new HashMap<>();
    }

    public void registrarReservacion(String nombre, int numeroAsiento) {
        if (!asientosOcupados.containsKey(numeroAsiento)) {
            Reservacion reservacion = new Reservacion(nombre, numeroAsiento);
            reservaciones.add(reservacion);
            asientosOcupados.put(numeroAsiento, nombre);
            System.out.println("Reservación registrada para " + nombre + ", Asiento: " + numeroAsiento);
        } else {
            System.out.println("El asiento " + numeroAsiento + " ya está ocupado.");
        }
    }

    public void eliminarReservacion(int numeroAsiento) {
        if (asientosOcupados.containsKey(numeroAsiento)) {
            String nombre = asientosOcupados.remove(numeroAsiento);
            reservaciones.removeIf(reservacion -> reservacion.getNumeroAsiento() == numeroAsiento);
            System.out.println("Reservación para " + nombre + ", asiento " + numeroAsiento + ", cancelada.");
        } else {
            System.out.println("No hay reservación para el asiento " + numeroAsiento + ".");
        }
    }

    public boolean verificarAsientoOcupado(int numeroAsiento) {
        return asientosOcupados.containsKey(numeroAsiento);
    }

    public void mostrarReservaciones() {
        System.out.println("Lista de Reservaciones:");
        for (Reservacion reservacion : reservaciones) {
            System.out.println(reservacion); // Usando el método toString() de Reservacion
        }
    }
}