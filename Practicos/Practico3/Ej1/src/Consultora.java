import java.util.ArrayList;

public class Consultora {
    private ArrayList<Encuesta> encuestas;
    
    public Consultora() {
        this.encuestas = new ArrayList<Encuesta>();
    }

    public void addEncuesta(Encuesta ee) {
        encuestas.add(ee);
    }

    public int cantidadDeEncuestasRealizadas(int dni) {
        int encuestasRealizadas = 0;
        for (Encuesta ee : encuestas) {
            if (ee.getDNIEmpleado() == dni) {
                encuestasRealizadas++;
            }
        }
        return encuestasRealizadas;
    }

}
