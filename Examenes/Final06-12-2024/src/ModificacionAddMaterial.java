public class ModificacionAddMaterial extends Modificacion {
    
    private String metal;

    public ModificacionAddMaterial(String mm) {
        this.metal = mm;
    }

    @Override
    public void modificar(Traje tt) {
        tt.addMetal(this.metal);
    }

}
