import java.time.LocalDate;

public class PaquetePromo extends PaqueteSimple {
    private LocalDate fIni;
    private LocalDate fFin;
    private double descuento;

    public PaquetePromo(,LocalDate fIni, LocalDate fFin, double descuento) {
        super();
        this.fIni = fIni;
        this.fFin = fFin;
        this.descuento = descuento;
    }

    public double getCosto() {
        if (this.getFechaDePago() != null) {
            if ((this.fechaDePago.isBeafore(fFin)) && (this.getFechaDePago().isAfter(fIni))) {
                return super.getCosto()*descuento;
            }
        }
        return super.getCosto();
    }
}
