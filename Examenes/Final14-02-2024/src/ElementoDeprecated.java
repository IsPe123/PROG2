import java.time.LocalDate;
import java.util.ArrayList;

public class ElementoDeprecated extends ElementoAlquilable {
    private ElementoAlquilable ee;
    private LocalDate vencimiento;
    private static int porcentaje = 2; 

    public ElementoDeprecated(ElementoAlquilable ee, LocalDate vv) {
        super();
        this.ee = ee;
        this.vencimiento = vv;
    }

    @Override
    public int getValor() {
        if (vencimiento.isAfter(LocalDate.now())) {
            return ee.getValor();
        }
        return ee.getValor() - (ee.getValor() * porcentaje / 100);
    }

    @Override
    public LocalDate getFechaDeCompra() {
        return ee.getFechaDeCompra();
    }

    public static void setPorcentaje(int pp) {
        porcentaje = pp;
    }

    @Override
    public String getDescripcion() {
        return ee.getDescripcion();
    }

    @Override
    public ArrayList<ElementoSimple> getElementosSimples() {
        ArrayList<ElementoSimple> salida = new ArrayList<ElementoSimple>();
        if (vencimiento.isAfter(LocalDate.now())) {
            return salida;
        }
        salida.addAll(ee.getElementosSimples());
        return salida;
    }

    @Override
    public double calcularAlquiler() {
        if (vencimiento.isAfter(LocalDate.now())) {
            return ee.calcularAlquiler() / 2;
        }
        return ee.calcularAlquiler();
    }

}
