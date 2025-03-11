public class CriterioValor extends CriterioAbs {

    private int vv;

    public CriterioValor(int valor) {
        this.vv = valor;
    }

    @Override
    public boolean cumple(ElementoAlquilable ee) {
        return ee.getValor() > this.vv;
    }

}
