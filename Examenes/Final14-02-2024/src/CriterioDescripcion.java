public class CriterioDescripcion extends CriterioAbs {

    private String descripcion;

    public CriterioDescripcion(String dd) {
        this.descripcion = dd;
    }

    @Override
    public boolean cumple(ElementoAlquilable ee) {
        return ee.getDescripcion().contains(this.descripcion);
    }
    
}
