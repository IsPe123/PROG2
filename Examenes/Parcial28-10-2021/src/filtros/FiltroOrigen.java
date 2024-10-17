package filtros;

public class FiltroOrigen extends Filtro {
    private String origen;

    public FiltroOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public boolean cumple(PaqueteViaje pp) {
        return pp.getOrigen().equals(origen);
    }
}
