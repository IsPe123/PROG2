import java.time.LocalDate;
import java.util.ArrayList;

import filtros.Filtro;

public class PaqueteSimple extends PaqueteViaje {
    private String origen;
    private String destino;
    private double costo;
    private String datosAlojamiento;
    private LocalDate fechaDePago;

    public PaqueteSimple(int ID, int cantPersonas, Stirng origen, String destino, double costo, String datosAlojamiento, LocalDate fechaDePago) {
        super(cantPersonas, ID);
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.datosAlojamiento = datosAlojamiento;
        this.fechaDePago = fechaDePago;
    }

    @Override
    public String getOrigen() {
        return origen;
    }

    @Override
    public String getDestino() {
        return destino;
    }

    @Override
    public double getCosto() {
        return costo;
    }
    
    @Override
    public LocalDate getFechaDePago() {
        return fechaDePago;
    }

    public ArrayList<PaqueteViaje> buscar(Filtro ff) {
        ArrayList<PaqueteViaje> elArray = new ArrayList<PaqueteViaje>();
        if(ff.cumple(this)) {
            elArray.add(this);
        }
        return elArray;
    }
}
