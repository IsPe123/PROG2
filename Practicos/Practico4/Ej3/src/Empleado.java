public class Empleado {
    private String nombre;
    private int sueldoFijo;

    public Empleado(String nombre, int sueldoFijo) {
        this.nombre = nombre;
        this.sueldoFijo = sueldoFijo;
    }

    public int calcularSueldo() {
        return sueldoFijo;
    }

    //GET && SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(int sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    
}
