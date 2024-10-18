public class CondicionPLA extends CondicionAbs {
    private int pla;
    
    public CondicionPLA(int pla) {
        this.pla = pla;
    }

    public boolean cumple(PiezaAbs pp) {
        return pp.getCantidadPLA() > pla;
    }

}
