import java.time.LocalDate;
import java.util.ArrayList;

public class Videoclub {
    private ArrayList<Item> items;
    private ArrayList<Cliente> clientes;
    private ArrayList<Alquiler> alquileres;

    public void addItem(Item ii) {
        items.add(ii);
    }
    
    public void addCliente(Cliente cc) {
        clientes.add(cc);
    }

    public void addAlquiler(Alquiler aa) {
        alquileres.add(aa);
    }

    public void alquilar(Cliente cc ,Item ii, LocalDate hasta) {
        if (ii.sePuedeAlquilar()) {
            Alquiler aa = new Alquiler(LocalDate.now(), hasta, cc.getDni(), ii.getId());
            addAlquiler(aa);
        }
    }
}
