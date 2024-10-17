import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<PaqueteViaje> {
    Comparator<PaqueteViaje> c1;
    Comparator<PaqueteViaje> c2;
    
    public ComparadorCompuesto(Comparator c1,Comparator c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(PaqueteViaje p1, PaqueteViaje p2) {
        int res1 = c1.compare(p1, p2);
        if (res1 == 0) {
            return c2.compare(p1, p2);
        }
        return res1;
    }
}
