package filtros;

public class FiltroAND extends Filtro {

    private Filtro ff1;
    private Filtro ff2;

    public FiltroAND(Filtro ff1, Filtro ff2) {
        this.ff1 = ff1;
        this.ff2 = ff2;
    }

    @Override
    public boolean cumple(PaqueteViaje pp) {
        return ((ff1.cumple(pp)) && (ff2.cumple(pp)));
    }
}
