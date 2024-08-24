public class Usuario {
    private String nombre;
    private long telefono;
    private String mail;
    private Agenda agenda;

    public Usuario(String nombre, long telefono, String mail, Agenda agenda) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
        this.agenda = agenda;
    }

    public Usuario(String nombre, long telefono, String mail) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda a) {
        this.agenda = a;
    }

}