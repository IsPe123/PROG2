package filtros;

public class FiltroNOT extends Filtro {
    
    private Filtro ff;
    
    public FiltroNOT(Filtro ff) {
        this.ff = ff;
    }

    @Override
    public boolean cumple(PaqueteViaje pp) {
        return !(ff.cumple(pp));
    }    
}
