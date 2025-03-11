import java.time.LocalDate;
import java.util.ArrayList;

public abstract class ElementoAlquilable {
    private int id;
    private static int contador = 0;

    public ElementoAlquilable() {
        this.id = contador++;
    }
    
    public int getId() {
        return this.id;
    }

    public abstract int getValor();
    public abstract LocalDate getFechaDeCompra();
    public abstract String getDescripcion();
    public abstract ArrayList<ElementoSimple> getElementosSimples();
    public abstract double calcularAlquiler();

}