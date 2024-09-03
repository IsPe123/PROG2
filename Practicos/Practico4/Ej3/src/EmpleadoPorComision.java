public class EmpleadoPorComision extends Empleado {
    private int porcentaje;
    private int comisiones;

    public EmpleadoPorComision(String nombre, int sueldoFijo, int porcentaje, int comisiones) {
        super(nombre, sueldoFijo);
        this.porcentaje = porcentaje;
        this.comisiones = comisiones;
    }

    @Override
    public int calcularSueldo() {
        return getSueldoFijo() + ((porcentaje * comisiones) / 100);
    }

    //GET && SET

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

}
