public class CriterioNOT extends Criterio {

    private Criterio cc;

    public CriterioNOT(Criterio cc) {
        this.cc = cc;
    }

    @Override
    public boolean cumple(ElemAbs ee) {
        return !cc.cumple(ee);
    }
    
}
