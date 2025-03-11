import java.time.LocalDate;

public class ElemCompuestoA extends ElemCompuesto {
    private String nombre;
    private LocalDate fechaDeCreacion;  

    public ElemCompuestoA(String nn, LocalDate fdc) {
        super();
        this.nombre = nn;
        this.fechaDeCreacion = fdc;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }
}
