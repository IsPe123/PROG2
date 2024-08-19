import java.util.ArrayList;

public class Temporada {
    private ArrayList<Episodio> episodios;

    public Temporada() {
        this.episodios = new ArrayList<>();
    }

    public void addEpisodio(Episodio e) {
        episodios.add(e);
    }

    public int episodiosVistos() {
        int episodiosVistos = 0;
        for (Episodio e : episodios) {
            if (e.getFlag()) {
                episodiosVistos += 1;
            }
        }
        return episodiosVistos;
    }

    public boolean vioTodos() {
        for (Episodio e : episodios) {
            if (!e.getFlag()) {
                return false;
            }
        }
        return true;
    }

    public double obtenerSumaCalificaciones() {
        double calificaciones = 0;
        for (Episodio e : episodios) {
            if (e.getCalificacion() >= 0) {
                calificaciones += e.getCalificacion(); 
            }
        }
        return calificaciones;
    }

    public int obtenerEpisodiosCalificados() {
        int episodiosCalificados = 0;
        for (Episodio e : episodios) {
            if (e.getCalificacion() > 0) {
                episodiosCalificados += 1; 
            }
        }
        return episodiosCalificados;    
    }

    public double obtenerPromedioCalificaciones() {
        return obtenerSumaCalificaciones()/obtenerEpisodiosCalificados();
    }
}
