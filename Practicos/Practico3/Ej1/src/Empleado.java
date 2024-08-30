public class Empleado {
    private String nombre;
    private int DNI;

    public Empleado(String nombre, int dNI) {
        this.nombre = nombre;
        DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

}
