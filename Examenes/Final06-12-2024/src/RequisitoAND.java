public class RequisitoAND extends Requisito {
    
    private Requisito r1;
    private Requisito r2;

    public RequisitoAND(Requisito r1, Requisito r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public boolean cumple(Miembro mm) {
        return r1.cumple(mm) && r2.cumple(mm);
    }
}
