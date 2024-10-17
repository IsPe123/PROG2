import java.time.LocalDate;

public class Alquiler {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int dni;
    private int idItem;

    public Alquiler(LocalDate fechaInicio, LocalDate fechaFin, int dni, int idItem) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.dni = dni;
        this.idItem = idItem;
    }

}
