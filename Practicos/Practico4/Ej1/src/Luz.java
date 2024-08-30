public class Luz {
    private boolean encendida;

    public Luz() {
        this.encendida = false;
    }

    public void encender() {
        this.encendida = true;
        System.out.println("Se encendio la luz");
    }

    public void apagar() {
        this.encendida = false;
        System.out.println("Se apago la luz");
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }
    
}
