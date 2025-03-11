import java.util.ArrayList;

public class ComidaCompuesta extends ComidaAbs {
    private ArrayList<ComidaAbs> ingredientes;

    public ComidaCompuesta(String nn) {
        super(nn);
        this.ingredientes = new ArrayList<ComidaAbs>();
    }
}
