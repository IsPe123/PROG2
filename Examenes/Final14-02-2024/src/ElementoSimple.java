import java.time.LocalDate;
import java.util.ArrayList;

public class ElementoSimple extends ElementoAlquilable implements Comparable<ElementoSimple>{
    private String descripcion;
    private int valor;
    private LocalDate fechaDeCompra;
    private AlquilerAbs aa;

    public ElementoSimple(String dd, int vv, LocalDate ff, AlquilerAbs aa) {
        super();
        this.descripcion = dd;
        this.valor = vv;
        this.fechaDeCompra = ff;
        this.aa = aa;
    }

    @Override
    public int getValor() {
        return this.valor;
    }

    @Override
    public LocalDate getFechaDeCompra() {
        return this.fechaDeCompra;
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public ArrayList<ElementoSimple> getElementosSimples() {
        ArrayList<ElementoSimple> salida = new ArrayList<ElementoSimple>();
        salida.add(this);
        return salida;
    }

    @Override
    public int compareTo(ElementoSimple o) {
        if (this.getId() != o.getId()) {
            return Integer.compare(this.getId(), o.getId());
        }
        return this.getFechaDeCompra().compareTo(o.getFechaDeCompra());
    }

    @Override
    public double calcularAlquiler() {
        return this.aa.calcular(this);
    }
    
}
