import java.time.LocalDate;

public class Entrenador extends Persona {
    private int id;
    static int contador = 0;

    public Entrenador(String nombre, String apellido, int pasaporte, LocalDate fechaDeNacimiento, int estado) {
        super(nombre, apellido, pasaporte, fechaDeNacimiento, estado);
        this.id = agregarId();
    }

    public int agregarId() {
        return ++contador;
    }

    public int getId() {
        return id;
    }

}