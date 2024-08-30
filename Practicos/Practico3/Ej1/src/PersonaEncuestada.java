public class PersonaEncuestada {
    private String nombre;
    private int DNI;

    public PersonaEncuestada(String nombre, int dNI) {
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

    public void setDNI(int dNI) {
        DNI = dNI;
    }
    
}
