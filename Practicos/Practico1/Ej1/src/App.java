import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Persona p1 = new Persona(43907171, LocalDate.of(2002, 4, 22), 'M', "Pedro Peter", "Islas", 82, 1.72);
        System.out.println(p1.calcularEdad());
        System.out.println(p1.toString());
    }
}
