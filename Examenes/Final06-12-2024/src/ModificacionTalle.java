public class ModificacionTalle extends Modificacion {
    
    private int plus;

    public ModificacionTalle(int plus) {
        this.plus = plus;
    }

    @Override
    public void modificar(Traje tt) {
        int anterior = tt.getTalle();
        tt.setTalle(anterior + this.plus);
    }
}