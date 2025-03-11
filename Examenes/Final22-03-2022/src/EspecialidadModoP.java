import java.util.ArrayList;

public class EspecialidadModoP extends EspecialidadAbs{

    private String modoP;

    public EspecialidadModoP(String mp) {
        this.modoP = mp;
    }

    public boolean loAcepta(Pedido pp) {
        ArrayList<ComidaAbs> comidas = pp.getComidas();
        for (ComidaAbs cc : comidas) {
            if (!(cc.getModoP().equals(this.modoP))) {
                return false;
            }
        }
        return true;
    }

}
