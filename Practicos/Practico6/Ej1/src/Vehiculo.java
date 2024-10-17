public class Vehiculo extends Item {
    private String marca;
    private int km;
    private String patente;
    private String tipo;
    private boolean alquilado = false;

    public Vehiculo(String marca, int km, String patente, String tipo) {
        super();
        this.marca = marca;
        this.km = km;
        this.patente = patente;
        this.tipo = tipo;
    }

    public boolean sePuedeAlquilar() {
        if(!alquilado) {
            alquilado = true;
            return true;
        } else {
            return false;
        }
    }
    
    
}
