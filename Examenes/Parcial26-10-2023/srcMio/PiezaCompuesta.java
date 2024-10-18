import java.util.ArrayList;

public class PiezaCompuesta extends PiezaAbs {
    protected ArrayList<PiezaAbs> piezas;
    private int extraPla;
	private int extraTiempo;

    public PiezaCompuesta(String nn, String dd, int ep, int, et) {
        super(nn, dd);
        this.extraPla = ep;
        this.extraTiempo = et;
        this.piezas = new ArrayList<PiezaAbs>();
    }

    @Override
    public int getCantidadPLA() {
        int cant = 0;
        for (PiezaAbs pp : piezas) {
            cant += pp.getCantidadPLA();
        }
        return cant + (this.contarPiezasSimples() * extraPla);
    }

    @Override
    public ArrayList<String> getColores() {
        ArrayList<String> respuesta = new ArrayList<String>();
        for (PiezaAbs pp : piezas) {
            ArrayList<String> aux = new ArrayList<String>();
            aux.addAll(pp.getColores());
            for (Strong cc: aux) {
                if (!aux.contains(cc)) {
                    aux.add(cc);
                }
            }
            respuesta.addAll(pp.getColores());
        }
        return respuesta;
    }  

    @Override
    public int getTiempo() {
        int respuesta = 0;
        for (PiezaAbs pp : piezas) {
            respuesta += pp.getTiempo();
        }
        return respuesta + extraTiempo;
    }

    @Override
    public ArrayList<PiezaSimple> buscar(Condicion cc) {
        ArrayList<PiezaSimple> respuesta = new ArrayList<PiezaSimple>();
        for (PiezaSimple pp : piezas) {
            respuesta.addAll(pp.buscar(Condicion cc));
        }
        return respuesta;
    }
    
    @Override
    public int contarPiezasSimples() {
        int suma = 0;
        for (PiezaAbs pp : piezas) {
            suma += pp.contarPiezasSimples();
        }
        return suma;
    }
  
}
