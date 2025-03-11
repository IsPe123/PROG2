import java.time.LocalDate;
import java.util.ArrayList;

public class ElemCompuestoC extends ElemCompuestoA {

    public ElemCompuestoC(String nn, LocalDate fdc) {
        super(nn, fdc);
    }

    @Override
    public ArrayList<ElemAbs> buscar(Criterio cc) {
        ArrayList<ElemAbs> salida = new ArrayList<ElemAbs>();
        for (ElemAbs ee : elementos) {
            salida.addAll(ee.buscar(cc));
        }
        return salida;
    }
    
}
