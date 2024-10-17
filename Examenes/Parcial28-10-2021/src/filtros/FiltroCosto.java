package filtros;

public class FiltroCosto extends Filtro {
    
    private double costoSupuesto;

    public FiltroCosto(double costoSupuesto) {
        this.costoSupuesto = costoSupuesto;
    }

    @Override
    public boolean cumple(PaqueteViaje pp) {
        return pp.getCosto() > costoSupuesto;
    }
}
