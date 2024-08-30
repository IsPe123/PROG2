import java.util.ArrayList;

public class Encuesta {
    private ArrayList<String> preguntas;
    private Cliente cliente;
    private int DNIEmpleado;
    private int DNIEncuestado;
    
    public Encuesta(Cliente cliente, int dNIEmpleado, int dNIEncuestado) {
        this.preguntas = new ArrayList<>();
        this.cliente = cliente;
        DNIEmpleado = dNIEmpleado;
        DNIEncuestado = dNIEncuestado;
    }

    public void addPregunta(String ss) {
        this.preguntas.add(ss);
    }

    public String listarPreguntas() {
        String respuesta = "";
        for (int i = 0; i < preguntas.size(); i++) {
            respuesta += (i + 1) + ". "  + preguntas.get(i) + "\n";
        }
        return respuesta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDNIEmpleado() {
        return DNIEmpleado;
    }

    public void setDNIEmpleado(int dNIEmpleado) {
        DNIEmpleado = dNIEmpleado;
    }

    public int getDNIEncuestado() {
        return DNIEncuestado;
    }

    public void setDNIEncuestado(int dNIEncuestado) {
        DNIEncuestado = dNIEncuestado;
    }

    
}
