import java.util.ArrayList;

public class Miembro { 
    private String nombreClave;
    private ArrayList<String> metales;
    private double altura;
    private String habilidad;

    public Miembro(String nombreClave, double altura, String habilidad) {
        this.nombreClave = nombreClave;
        this.metales = new ArrayList<String>();
        this.altura = altura;
        this.habilidad = habilidad;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public void addMetal(String mm) {
        if (!metales.contains(mm)) {
            metales.add(mm);
        }
    }

    public void removeMetal(String mm) {
        if (metales.contains(mm)) {
            metales.remove(mm);
        }
    }

    public ArrayList<String> getMetales() {
        return new ArrayList<String>(metales);
    }
}