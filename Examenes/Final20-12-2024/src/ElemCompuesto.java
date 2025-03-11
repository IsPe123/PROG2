import java.util.ArrayList;

public abstract class ElemCompuesto extends ElemAbs {
    protected ArrayList<ElemAbs> elementos;

    public ElemCompuesto() {
        this.elementos = new ArrayList<ElemAbs>();
    }

    @Override
    public int calcularTamanio() {
        int salida = 0;
        for (ElemAbs ee : elementos) {
            salida += ee.calcularTamanio();
        }
        return salida;
    }

    @Override
    public ArrayList<ElemAbs> buscar(Criterio cc) {
        ArrayList<ElemAbs> salida = new ArrayList<ElemAbs>();
        for (ElemAbs ee : elementos) {
            salida.addAll(ee.buscar(cc));
        }
        if (cc.cumple(this)) {
            salida.add(this);
        }
        return salida;
    }

    public void AddElemento(ElemAbs ea) {
        elementos.add(ea);
    }

}
