public class AlquilerMontoFijo extends AlquilerAbs {
    
    private double monto;

    public AlquilerMontoFijo(double mm) {
        this.monto = mm;
    }

    @Override
    public double calcular(ElementoSimple ee) {
        return monto;
    }
}
