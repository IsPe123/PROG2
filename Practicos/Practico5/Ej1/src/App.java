import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Planta p1 = new Planta("Plantita 1 elegante", "Plantita 1 wachin", "Suiza", LocalDate.of(2000, 1, 1));
        Planta p2 = new Planta("Plantita 2 elegante", "Plantita 2 wachin", "Argentina", LocalDate.of(2002, 6, 6));
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
