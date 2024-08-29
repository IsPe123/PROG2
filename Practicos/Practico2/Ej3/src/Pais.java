import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Provincia> provincias;
    private ArrayList<Impuesto> impuestos;
    
    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
        this.impuestos = new ArrayList<>();
    }

    public ArrayList<String> listarCiudadesConDeficit() {
        ArrayList<String> ciudades = new ArrayList<>();
        ArrayList<Impuesto> impuestosCopia = new ArrayList<>(impuestos);
        for (Provincia pp : provincias) {
        //    ciudades.addAll(pp.listarCiudadesConDeficit(impuestosCopia));
        }
        return ciudades;
    }

    public double calcularRecaudacionPorHabitantes(int habitantes) {
        double monto = 0;
        for (Provincia pp : provincias) {
            monto += pp.calcularRecaudacionPorHabitantes(habitantes);
        }
        double resultado = calcularImpuestos(monto);
        return resultado;
    }

    public double calcularImpuestos(double monto) {
        double recaudacion = 0;
        for (Impuesto ii : impuestos) {
            recaudacion += ii.calcularRecaudacion(monto);
        }
        return recaudacion;
    }

    public void agregarProvincia(Provincia p) {
        this.provincias.add(p);
    }

    public void agregarImpuesto(Impuesto i) {
        this.impuestos.add(i);
    } 
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
