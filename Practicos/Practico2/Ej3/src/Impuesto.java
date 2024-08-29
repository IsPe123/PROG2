public class Impuesto {
    private int porcentaje;

    public Impuesto(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double calcularRecaudacion(double montoBruto) {
        return (porcentaje * montoBruto) / 100;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

}
