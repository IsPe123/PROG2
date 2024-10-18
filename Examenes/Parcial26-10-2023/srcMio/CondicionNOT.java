public class CondicionNOT extends CondicionAbs {
    private CondicionAbs c1;
    
    public CondicionNOT(CondicionAbs cc) {
        this.c1 = cc;
    }

    public boolean cumple(PiezaAbs pp) {
        return !(c1.cumple(pp));
    }
}
