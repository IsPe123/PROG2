import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

/*
    public ArrayList<String> listarCiudadesConDeficit(ArrayList<Impuesto> impuestos) {
        ArrayList<String> nombreCiudades = new ArrayList<>();
        for (Ciudad cc : ciudades) {
            if (cc.getGasto() > cc.calcularRecaudacion(impuestos)) {
                nombreCiudades.add(cc.getNombre());
            }
        }
        return nombreCiudades;
    }
*/
    public double calcularRecaudacionPorHabitantes(int habitantes){
        double recaudacion = 0;
        for (Ciudad cc : ciudades) {
            if (cc.getHabitantes() >= 100000) {
                recaudacion += cc.getRecaudacionBruta();
            }
        }
        return recaudacion;
    }

    public void agregarCiudad(Ciudad cc) {
        this.ciudades.add(cc);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
