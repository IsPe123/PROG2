import java.util.ArrayList;

public class Estacion {
    private ArrayList<Pedido> pedidos;  
    private EspecialidadAbs especialidad;
  
    public Estacion(EspecialidadAbs ee) {
        this.pedidos = new ArrayList<Pedido>();
        this.especialidad = ee;
    }

    public boolean loAcepta(Pedido pp) {
        return especialidad.loAcepta(pp);
    }

    public void addPedido(Pedido pp) {
        pedidos.add(pp);
    }
}
