package filtros;
import java.time.LocalDate;

public class FiltroFecha {
    
    private LocalDate fecha;

    public FiltroFecha(LocalDate fecha) {
        this.fecha = fecha;
    }    

    @Override
    public boolean cumple(PaqueteViaje pp) {
        if (pp.getFechaDePago != null) {
            return fecha.equals(pp.getFechaDePago());
        }
        return false;
    }
}
