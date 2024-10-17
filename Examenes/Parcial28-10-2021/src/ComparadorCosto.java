import java.util.Comparator;

public class ComparadorCosto implements Comparator<PaqueteViaje> {
    
    @Override
    public int compare(PaqueteViaje o1, PaqueteViaje o2) {
        double c1 = o1.getCosto();
        double c2 = o2.getCosto();
        return (int) c1-c2;
    }
}
