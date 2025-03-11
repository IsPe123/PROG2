import java.util.ArrayList;

public class Traje extends TrajeABS {
    private int talle;
    private ArrayList<String> metales;
    private String planeta;
    private Requisito rr;

    public Traje(String nn, int talle, String planeta) {
        super(nn);
        this.talle = talle;
        this.metales = new ArrayList<String>();
        this.planeta = planeta;
    }

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public ArrayList<String> getMetales() {
        return new ArrayList<String>(metales);
    }

    public void addMetal(String mm) {
        if(!metales.contains(ss)) {
            metales.add(mm);
        }
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public ArrayList<Traje> buscar(Miembro mm) {
        ArrayList<Traje> salida = new ArrayList<Traje>();
        if (rr.cumple(mm)) {
            salida.add(this);
        }
        return salida;
    }

    @Override
    public ArrayList<TrajeABS> copiaModificada(Modificacion mm) {
        ArrayList<TrajeABS> salida = new ArrayList<TrajeABS>();
        mm.modificar(this);
        return salida;
    }

}
