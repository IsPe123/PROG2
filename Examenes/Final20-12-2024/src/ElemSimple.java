import java.time.LocalDate;
import java.util.ArrayList;

public class ElemSimple extends ElemAbs {
    private String nombre;
    private int tamanio;
    private LocalDate fechaDeCreacion;
    private String txt;

    @Override
    public int calcularTamanio() {
        return tamanio;
    }

    @Override
    public ArrayList<ElemAbs> buscar(Criterio cc) {
        ArrayList<ElemAbs> salida = new ArrayList<ElemAbs>();
        if (cc.cumple(this)) {
            salida.add(this);   
        }
        return salida;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public String getTxt() {
        return txt;
    }

}
