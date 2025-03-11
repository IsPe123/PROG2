public class CriterioNombre extends Criterio {

    private String nn;

    public CriterioNombre(String nn) {
        this.nn = nn;
    }

    @Override
    public boolean cumple(ElemAbs ee) {
        return ee.getNombre().contains(this.nn);
    }
    
}
