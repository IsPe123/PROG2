public class CondicionTiempo {
    private String tt;
    
    public CondicionTiempo(int tt) {
        this.tt = tt;
    }

    public boolean cumple(PiezaAbs pp) {
        return pp.getTiempo() > tt;
    }
}
