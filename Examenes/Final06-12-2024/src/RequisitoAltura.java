public class RequisitoAltura extends Requisito {
    
    private double altura;

    public RequisitoAltura(double aa) {
        this.altura = aa;
    }

    @Override
    public boolean cumple(Miembro mm) {
        return mm.getAltura() > this.altura;
    }

}
