import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Agenda aa = new Agenda("MyAgenda");
        Usuario uu = new Usuario("Juan", 249411223, "juandoe@gmail.com");
        Usuario uu2 = new Usuario("Pedro", 249469595, "pedrodoe@gmail.com");
        Reunion rr = new Reunion("PlazaDelTanque", "Narcotrafico", 120, LocalDate.of(2024,12,25));

        aa.addReunion(rr);
        rr.addParticipantes(uu);
        rr.addParticipantes(uu2);
        
        uu.setAgenda(aa);

    }
}
