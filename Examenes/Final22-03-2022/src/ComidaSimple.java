public class ComidaSimple extends ComidaAbs {
    private String tipo;
    private String modoP;
    private int calorias;
    private double precio;
    private int tiempo;

    public ComidaSimple(String nn, String tipo, String mP, int cc, double pp, int tt) {
        super(nn);
        this.tipo = tipo;
        this.modoP = mP;
        this.calorias = cc;
        this.precio = pp;
        this.tiempo = tt;
    }


}
