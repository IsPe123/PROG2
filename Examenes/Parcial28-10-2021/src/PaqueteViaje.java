import java.time.LocalDate;

import filtros.Filtro;

public abstract class PaqueteViaje implements Comparable<PaqueteViaje> {
    private int cantPersonas;
    private int ID;
    
    public PaqueteViaje(int cantPersonas, int ID) {
        this.cantPersonas = cantPersonas;
        this.ID = ID;
    }

    public abstract String getOrigen();
    public abstract String getDestino();
    public abstract double getCosto();
    public abstract LocalDate getFechaDePago();
    public abstract ArrayList<PaqueteViaje> buscar(Filtro ff);
    public ArrayList<PaqueteViaje> buscar(Filtro ff, Comparator cc) {

    }


    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        this.ID = iD;
    }

    public int compareTo(PaqueteViaje pp) {
        return this.getCantPersonas().compareTo(pp.getCantPersonas());
    }

}
