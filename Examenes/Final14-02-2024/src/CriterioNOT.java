public class CriterioNOT extends CriterioAbs {
 
    private CriterioAbs c1;

    public CriterioNOT(CriterioAbs c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(ElementoAlquilable ee) {
        return !(c1.cumple(ee));
    }

}
