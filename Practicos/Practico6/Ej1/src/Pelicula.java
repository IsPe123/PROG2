public class Pelicula extends Item {
    private String titulo;
    private String director;
    private String estudio;
    private int copias;

    public Pelicula(String titulo, String director, String estudio, int copias) {
        super();
        this.titulo = titulo;
        this.director = director;
        this.estudio = estudio;
        this.copias = copias;
    }

    public boolean sePuedeAlquilar() {
        if(copias > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    
}
