public class CriterioID extends CriterioAbs {
    private int id;

    public CriterioID(int id){
        this.id = id;
    }

    public boolean cumple(ElementoAlquilable ee) {
        return (ee.getId() == this.id);
    }
}
