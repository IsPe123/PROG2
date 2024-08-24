import java.util.ArrayList;

public class Agenda {
    private String titulo;
    private ArrayList<Reunion> reuniones;

    public Agenda(String titulo) {
        this.titulo = titulo;
        this.reuniones = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void addReunion(Reunion r) {
        this.reuniones.add(r);
    }
    

}
