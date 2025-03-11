import java.util.ArrayList;

public abstract class TrajeABS {
    private String nombre;
    
    public TrajeABS(String nn) {
        this.nombre = nn;
    }

    public String getNombre() {
        return this.nombre;
    }

    public abstract ArrayList<String> getMetales();
    public abstract int getTalle();
    public abstract ArrayList<Traje> buscar(Miembro mm);
    public abstract ArrayList<TrajeABS> copiaModificada(Modificacion mm);

}