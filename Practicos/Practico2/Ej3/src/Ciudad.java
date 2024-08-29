import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private int recaudacionBruta;
    private int gasto;
    private int habitantes;
    
    public Ciudad(String nombre, int recaudacionBruta, int gasto,  int habitantes) {
        this.nombre = nombre;
        this.recaudacionBruta = recaudacionBruta;
        this.gasto = gasto;
        this.habitantes = habitantes;
    }

    public void calcularRecaudacion(ArrayList<Impuesto> impuestos) {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public int getRecaudacionBruta() {
        return recaudacionBruta;
    }

    public void setRecaudacionBruta(int recaudacionBruta) {
        this.recaudacionBruta = recaudacionBruta;
    }

    public int getGasto() {
        return gasto;
    }

    public void setGasto(int gasto) {
        this.gasto = gasto;
    }

    

}
