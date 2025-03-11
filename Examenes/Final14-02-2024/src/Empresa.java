import java.util.ArrayList;
import java.util.Collections;

public class Empresa {
    protected ArrayList<ElementoAlquilable> elementos;
    
    public Empresa() {
        this.elementos = new ArrayList<ElementoAlquilable>();
    }

    public ArrayList<ElementoSimple> listar(CriterioAbs cc) {
        ArrayList<ElementoSimple> salida = new ArrayList<ElementoSimple>();
        for (ElementoAlquilable ee : elementos) {
            ArrayList<ElementoSimple> aux = new ArrayList<ElementoSimple>();
            aux.addAll(ee.getElementosSimples());
            for (ElementoSimple ee2 : aux) {
                if (cc.cumple(ee2)) {
                    salida.add(ee2);
                }
            }
        }
        Collections.sort(salida);
        return salida;
    }

}