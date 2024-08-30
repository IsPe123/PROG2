public class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa() {
        super();
        this.luz = new Luz();
    }
    
    @Override
    public void hacerSonar() {
        super.hacerSonar();
        luz.encender();
    }
}
