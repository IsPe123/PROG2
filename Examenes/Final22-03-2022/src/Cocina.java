import java.util.ArrayList;

public class Cocina {
    private ArrayList<Estacion> estaciones;

    public Cocina() {
        this.estaciones = new ArrayList<Estacion>();
    }

    public void addPedido(Pedido pp) {
        for (Estacion ee : estaciones) {
            if (ee.loAcepta(pp)) {
                ee.addPedido(pp);
                break;
            }
        }
    }
}
