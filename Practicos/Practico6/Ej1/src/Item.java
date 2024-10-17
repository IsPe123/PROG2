public abstract class Item {
    private int id;
    private static int contador = 0;

    public Item() {
        this.id = ++contador;
    }

    public int getId() {
        return id;
    }

    public abstract boolean sePuedeAlquilar();
}
