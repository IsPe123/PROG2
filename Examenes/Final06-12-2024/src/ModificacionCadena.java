import java.util.ArrayList;

public class ModificacionCadena extends Modificacion {
    
    private ArrayList<Modificacion> modificaciones;

    public ModificacionCadena() {
        this.modificaciones = new ArrayList<Modificacion>();
    }

    @Override
    public void modificar(Traje tt) {
        for (Modificacion mm : modificaciones) {
            mm.modificar(tt);
        }
    }

    public void addModificacion(Modificacion mm) {
        modificaciones.add(mm);
    }

}