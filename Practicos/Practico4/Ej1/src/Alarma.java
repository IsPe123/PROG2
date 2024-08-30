public class Alarma {
    private boolean vidrioRoto;
    private boolean entradaAbierta;
    private boolean hayMovimiento;
    private Timbre timbre;

    public Alarma() {
    }

    public void comprobar() {
        if(vidrioRoto || entradaAbierta || hayMovimiento) {
            hacerSonar();
        }
    }

    public void hacerSonar() {
        timbre.hacerSonar();
    }

}
