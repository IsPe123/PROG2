public class EspecialidadTipo extends EspecialidadAbs{
    
    private String tipo;

    public EspecialidadTipo(String tt) {
        this.tipo = tt;
    }

    public boolean loAcepta(Pedido pp) {
        ArrayList<ComidaAbs> comidas = pp.getComidas();
        for (ComidaAbs cc : comidas) {
            if (!(cc.getTipo().equals(this.tipo))) {
                return false;
            }
        }
        return true;
    }

}