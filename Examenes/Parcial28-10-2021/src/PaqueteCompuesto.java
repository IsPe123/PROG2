import java.util.ArrayList;

import filtros.Filtro;

import java.time.LocalDate;


public class PaqueteCompuesto extends PaqueteViaje {
    private ArrayList<PaqueteViaje> paquetes;

    public PaqueteCompuesto(int cantPersonas, int ID) {
        super(cantPersonas, ID);
        this.paquetes = new ArrayList<PaqueteViaje>;
    }

    public String getOrigen() {
        if (!paquetes.isEmpty()) {
            return paquetes.get(0).getOrigen();
        } else {
            return null;
        }
    }

    public String getDestino() {
        if(!paquetes.isEmpty()) {
           return paquetes.get(paquetes.size()-1).getDestino(); 
        } else {
            return null;
        }
    }

    public double getCosto() {
        double costo = 0.0;
        if (!paquetes.isEmpty()) {
            for (PaqueteViaje pp : paquetes) {
                costo += pp.getCosto();
            }            
        }
        return costo;
    }

    public LocalDate getFechaDePago() {
        LocalDate ultimaFDP = LocalDate.of(1900, 1, 1); ;
        for (PaqueteViaje pp : paquetes) {
            if (pp.getFechaDePago() == null) {
                return null;
            } else if (pp.getFechaDePago().compareTo(ultimaFDP)>0) {
                ultimaFDP = pp.getFechaDePago();
            }
        }
        return ultimaFDP;
    }

    public void addPaquete(PaqueteViaje pp) {
        if (!paquetes.isEmpty()) {
            if (paquetes.get(paquetes.size()-1).getDestino() == pp.getOrigen()) {
                if (this.getCantPersonas() == pp.getCantPersonas()) {
                    paquetes.add(pp);  
                }  
            }
        } else if (pp.getCantPersonas() > 0) {
            paquetes.add(pp);  
        }
    }

    public ArrayList<PaqueteViaje> buscar(Filtro ff) {
        ArrayList<PaqueteViaje> elArray = new ArrayList<PaqueteViaje>();
        if(ff.cumple(this)) {
            elArray.add(this);
        } else {
            for (PaqueteViaje pp : paquetes) {
                if (ff.cumple(pp)) {
                    elArray.addAll(pp);
                }
            }
        }
        return elArray;
    }

}
