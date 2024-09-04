import java.time.LocalDate;

public class Masajista extends Persona {
    private String titulo;
    private int aniosDeExperiencia;

    public Masajista(String nombre, String apellido, int pasaporte, LocalDate fechaDeNacimiento, int estado, String titulo, int aniosDeExperiencia) {
        super(nombre, apellido, pasaporte, fechaDeNacimiento, estado);
        this.titulo = titulo;
        this.aniosDeExperiencia = aniosDeExperiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAniosDeExperiencia() {
        return aniosDeExperiencia;
    }

    public void setAniosDeExperiencia(int aniosDeExperiencia) {
        this.aniosDeExperiencia = aniosDeExperiencia;
    }
    
}
