public class CondicionAND extends CondicionAbs {
    private CondicionAbs c1;
    private CondicionAbs c2;
    
    public CondicionAND(CondicionAbs c1, CondicionAbs c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(PiezaAbs pp) {
        return (c1.cumple(pp) && c2.cumple(pp));
    }
}
