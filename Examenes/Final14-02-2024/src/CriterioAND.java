public class CriterioAND extends CriterioAbs {

    private CriterioAbs c1;
    private CriterioAbs c2;

    public CriterioAND(CriterioAbs c1, CriterioAbs c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(ElementoAlquilable ee) {
        return (c1.cumple(ee) && c2.cumple(ee));
    }
    
}
