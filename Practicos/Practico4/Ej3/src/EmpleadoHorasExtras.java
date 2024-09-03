public class EmpleadoHorasExtras extends Empleado{
    private int horasExtras;
    static int montoPorHora = 10;

    public EmpleadoHorasExtras(String nombre, int sueldoFijo, int horasExtras) {
        super(nombre, sueldoFijo);
        this.horasExtras = horasExtras;
    }

    @Override
    public int calcularSueldo() {
        return getSueldoFijo() + (horasExtras * montoPorHora);
    }

    //GET && SET

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public static int getMontoPorHora() {
        return montoPorHora;
    }

    public static void setMontoPorHora(int montoPorHora) {
        EmpleadoHorasExtras.montoPorHora = montoPorHora;
    }
       
}
