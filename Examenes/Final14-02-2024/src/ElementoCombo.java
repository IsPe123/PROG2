import java.time.LocalDate;
import java.util.ArrayList;

public class ElementoCombo extends ElementoAlquilable {
    protected ArrayList<ElementoAlquilable> elementos;

    public ElementoCombo() {
        super();
        this.elementos = new ArrayList<ElementoAlquilable>();
    }

    @Override
    public int getValor() {
        int salida = 0;
        for (ElementoAlquilable ee : elementos) {
            salida += ee.getValor();
        }
        return salida;
    }

    @Override
    public LocalDate getFechaDeCompra() {
        LocalDate salida = elementos.get(0).getFechaDeCompra();
        for (ElementoAlquilable ee : elementos) {
            LocalDate aux = ee.getFechaDeCompra();
            if (aux.isAfter(salida)) {
                salida = aux;
            }
        }
        return salida;
    }

    @Override
    public String getDescripcion() {
        String salida = " ";
        for (ElementoAlquilable ee : elementos) {
            salida.concat(ee.getDescripcion());
        }
        return salida;
    }

    @Override
    public ArrayList<ElementoSimple> getElementosSimples() {
        ArrayList<ElementoSimple> salida = new ArrayList<ElementoSimple>();
        for (ElementoAlquilable ee : elementos) {
            salida.addAll(ee.getElementosSimples());
        }
        return salida;
    }

    @Override
    public double calcularAlquiler() {
        double salida = 0.0;
        for (ElementoAlquilable ee : elementos) {
            salida += ee.calcularAlquiler();
        }
        return salida;
    }


 
}
