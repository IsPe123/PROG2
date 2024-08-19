public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean flag;
    private int calificacion;
    
    public Episodio(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.flag = false;
        this.calificacion = -1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if (calificacion < 0 || calificacion > 5) {
            System.out.println("Valor invalido, no se hicieron cambios");
        } else if (!getFlag()) {
            System.out.println("Necesita ver el episodio para calificarlo");
        } else {
            this.calificacion = calificacion;
        }   
    }

}
