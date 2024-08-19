import java.util.ArrayList;

public class Serie {
    private ArrayList<Temporada> temporadas;
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;

    public Serie(String titulo, String descripcion, String creador, String genero) {
        this.temporadas = new ArrayList<>();
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
    }

    public void addTemporada(Temporada t) {
        temporadas.add(t);
    }
    
    public int episodiosVistos() {
        int episodiosVistos = 0;
        for (Temporada t : temporadas) {
            episodiosVistos += t.episodiosVistos();    
        }
        return episodiosVistos;
    }

    public double obtenerPromedioCalificaciones() {
        double calificaciones = 0;
        double episodiosCalificados = 0;
        for (Temporada t : temporadas) {
            calificaciones += t.obtenerSumaCalificaciones();
            episodiosCalificados += t.obtenerEpisodiosCalificados();
        }

        return calificaciones/episodiosCalificados;
    }

    public boolean vioTodos() {
        for (Temporada t : temporadas) {
            if (!t.vioTodos()) {
                return false;
            }
        }
        return true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
