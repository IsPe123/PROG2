public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("Amazon");
        Empleado emp1 = new Empleado("Juan", 43907111);
        PersonaEncuestada pe1 = new PersonaEncuestada("Peter", 43907171);
        Encuesta enc1 = new Encuesta(c1, emp1.getDNI(), pe1.getDNI());
        enc1.addPregunta("La primer pregunta¿?");
        enc1.addPregunta("La segunda pregunta¿?");
        enc1.addPregunta("La tercera pregunta¿?");
        enc1.addPregunta("La cuarta pregunta¿?");
        System.out.println(enc1.listarPreguntas()); 
    }
}
