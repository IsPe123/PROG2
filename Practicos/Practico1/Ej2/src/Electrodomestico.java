public class Electrodomestico {
    private String nombre;
    private int precioBase;
    private String color;
    private int consumoEnergetico;
    private int peso;

    public Electrodomestico(String nombre) {
        this.nombre = nombre;
        this.precioBase = 100;
        this.color = "gris plata";
        this.consumoEnergetico = 10;
        this.peso = 2;
    }

    public Electrodomestico(String nombre, int precioBase, String color, int consumoEnergetico, int peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public boolean esBajoConsumo() {
        return (consumoEnergetico < 45);
    }

    public double calcularBalance() {
        return (precioBase/peso);
    }

    public boolean esAltaGama() {
        return (calcularBalance() > 3);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    
}
