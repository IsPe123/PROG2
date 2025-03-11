import java.util.ArrayList;

public class ElemCompuestoB extends ElemCompuesto {
    private int porcentajeCompresion;

    public ElemCompuestoB(int pc) {
        super();
        this.porcentajeCompresion = pc;
    }

    @Override
    public int calcularTamanio() {
        int salida = super.calcularTamanio();
        return (salida - (salida * porcentajeCompresion / 100));
    }

    @Override
    public ArrayList<ElemAbs> buscar(Criterio cc) {
        ArrayList<ElemAbs> salida = new ArrayList<ElemAbs>();
        salida.addAll(super.buscar(cc));
        if (!salida.isEmpty()) {
            salida.clear();
            salida.add(this);
        }
        return salida;
    }

    @Override
    public String getNombre() {
        return null;
    }
}
