import java.time.LocalDate;
import java.util.ArrayList;

public class Reunion {
    private String lugar;
    private String tema;
    private int duracion;
    private LocalDate fecha;
    private ArrayList<Usuario> participantes;

    public Reunion(String lugar, String tema, int duracion, LocalDate fecha) {
        this.lugar = lugar;
        this.tema = tema;
        this.duracion = duracion;
        this.fecha = fecha;
        this.participantes = new ArrayList<>();
    }

    public void addParticipantes(Usuario uu) {
        participantes.add(uu);
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


    
}
