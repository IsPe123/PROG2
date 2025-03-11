import java.util.ArrayList;

public class EquipoTactico extends TrajeABS {
    protected ArrayList<TrajeABS> trajes;

    public EquipoTactico(String nn) {
        super(nn);
        this.trajes = new ArrayList<TrajeABS>();
    }
    
    @Override
    public ArrayList<String> getMetales() {
        ArrayList<String> salida = new ArrayList<String>();
        for (TrajeABS tt : trajes) {
            ArrayList<String> aux = new ArrayList<String>(tt.getMetales());
            for (String mm : aux) {
                if (!salida.contains(mm)) {
                    salida.add(mm);
                }
            }
        }
        return salida;
    }

    @Override
    public int getTalle() {
        int salida = trajes.get(0).getTalle();
        for (TrajeABS tt : trajes) {
            if (tt.getTalle() < salida) {
                salida = tt.getTalle();
            }
        }
        return salida;
    }

    @Override
    public ArrayList<Traje> buscar(Miembro mm) {
        ArrayList<Traje> salida = new ArrayList<Traje>();
        for (TrajeABS tt : trajes) {
            salida.addAll(tt.buscar(mm));
        }
        return salida;
    }

    @Override
    public ArrayList<TrajeABS> copiaModificada(Modificacion mm) {
        ArrayList<TrajeABS> salida = new ArrayList<TrajeABS>(trajes);
        for (TrajeABS tt : salida) {
            tt.copiaModificada(mm);
        }
        return salida;
    }
    
}
