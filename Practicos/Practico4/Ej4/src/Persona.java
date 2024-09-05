import java.time.LocalDate;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int pasaporte;
    private LocalDate fechaDeNacimiento;
    private int estado;
    static final String[] estados = {"Viajando", "En concentración", "En país de origen"};

    public Persona(String nombre, String apellido, int pasaporte, LocalDate fechaDeNacimiento, int estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = pasaporte;
        this.fechaDeNacimiento = fechaDeNacimiento;
        setEstado(estado);;
    }

    public String conocerEstado() {
        if (estados[estado] == "En concentración") {
            return "Esta disponible";
        } else {
            return "No esta disponible";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        if (estado < estados.length && estado >= 0) {
            this.estado = estado;
        } else {
            System.out.println("Error, se le asignó 'En país de origen'");
            this.estado = 2;
        }
    }

    public static String[] getEstados() {
        return estados;
    } 

    
}