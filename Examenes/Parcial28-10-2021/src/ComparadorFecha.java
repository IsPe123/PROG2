import java.time.LocalDate;
import java.util.Comparator;

public class ComparadorFecha implements Comparator<PaqueteViaje> {
   
    @Override
    public int compare(PaqueteViaje o1, PaqueteViaje o2) {
        LocalDate f1 = o1.getFechaDePago();
        LocalDate f2 = o2.getFechaDePago();
        if (f1 != null) {
            return f1.compareTo(f2);
        }
        return -1;
    }
}
