import java.util.ArrayList;

public abstract class ElemAbs {
    public abstract int calcularTamanio();
    public abstract ArrayList<ElemAbs> buscar(Criterio cc);
    public abstract String getNombre();
}
