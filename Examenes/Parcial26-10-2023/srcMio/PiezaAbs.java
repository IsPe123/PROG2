import java.util.ArrayList;

public abstract class PiezaAbs {
    private String nombre;
    private String descripcion;

    public PiezaAbs(String nn, String dd) {
        this.nombre = nn;
        this.descripcion = dd;        
    }

    public String getNombre() {
        return nombre;
    }

    public String descripcion() {
        return descripcion;
    }

    public abstract int getCantidadPLA();
    public abstract ArrayList<String> getColores();
    public abstract int getTiempo();
    public abstract ArrayList<PiezaSimple> buscar(Condicion cc);
    public abstract int contarPiezasSimples();

}
