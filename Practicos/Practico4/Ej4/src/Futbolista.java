import java.time.LocalDate;

public class Futbolista extends Persona {
    private int posicion;
    private char pieHabil;
    private int goles;

    public Futbolista(String nombre, String apellido, int pasaporte, LocalDate fechaDeNacimiento, int estado, int posicion, char pieHabil, int goles) {
        super(nombre, apellido, pasaporte, fechaDeNacimiento, estado);
        this.posicion = posicion;
        this.pieHabil = pieHabil;
        this.goles = goles;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public char getPieHabil() {
        return pieHabil;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

}
