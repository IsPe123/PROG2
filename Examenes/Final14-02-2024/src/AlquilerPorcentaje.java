public class AlquilerPorcentaje extends AlquilerAbs {
    
    private int porcentaje;

    public AlquilerPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcular(ElementoSimple ee) {
        return ee.getValor() * porcentaje / 100;
    }
}
