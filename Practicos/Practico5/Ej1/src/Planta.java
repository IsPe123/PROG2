import java.time.LocalDate;

public class Planta {
    private String nombreCientifico;
    private String nombreComun;
    private String paisDeOrigen;
    private LocalDate fechaDeCompra;
    private int id;
    static int contador = 0;
    
    public Planta(String nombreCientifico, String nombreComun, String paisDeOrigen, LocalDate fechaDeCompra) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.paisDeOrigen = paisDeOrigen;
        this.fechaDeCompra = fechaDeCompra;
        generateId();
    }

    private void generateId() {
        this.id = ++contador;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public LocalDate getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(LocalDate fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Planta [nombreCientifico=" + nombreCientifico + ", nombreComun=" + nombreComun + ", paisDeOrigen="
                + paisDeOrigen + ", fechaDeCompra=" + fechaDeCompra + ", id=" + id + "]";
    }
    
}
