public class Reservacion {
    private String nombre;
    private int numeroAsiento;

    public Reservacion(String nombre, int numeroAsiento) {
        this.nombre = nombre;
        this.numeroAsiento = numeroAsiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Asiento: " + numeroAsiento;
    }
}
