import java.util.ArrayList;

public class Pedido {
    private ArrayList<ComidaAbs> comidas;
    private int mesa;
    private String mozo;

    public Pedido(int ms, String mz) {
        this.comidas = new ArrayList<ComidaAbs>();
        this.mesa = ms;
        this.mozo = mz;
    }

    public ArrayList<ComidaAbs> getComidas() {
        return new ArrayList<ComidaAbs>(comidas);
    }


}
