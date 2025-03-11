public class ModificacionPlaneta extends Modificacion {
    
    private String nuevoPlaneta;

    public ModificacionPlaneta(String np) {
        this.nuevoPlaneta = np;
    }

    @Override
    public void modificar(Traje tt) {
        tt.setPlaneta(this.nuevoPlaneta);
    }

}
