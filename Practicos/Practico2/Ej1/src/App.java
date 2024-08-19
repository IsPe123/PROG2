public class App {
    public static void main(String[] args) throws Exception {
        Episodio ep1 = new Episodio("Ep1", "blabla");
        Episodio ep2 = new Episodio("Ep2", "blabla");
        Episodio ep3 = new Episodio("Ep3", "blabla");
        Episodio ep4 = new Episodio("Ep4", "blabla");

        ep1.setFlag(true);
        ep1.setCalificacion(3);

        ep2.setFlag(true);
        ep2.setCalificacion(5);

        Temporada t1 = new Temporada();
        t1.addEpisodio(ep1);
        t1.addEpisodio(ep2);
        t1.addEpisodio(ep3);
        t1.addEpisodio(ep4);


        Episodio ep5 = new Episodio("Ep5", "blabla");
        Episodio ep6 = new Episodio("Ep6", "blabla");
        Episodio ep7 = new Episodio("Ep7", "blabla");
        Episodio ep8 = new Episodio("Ep8", "blabla");

        Temporada t2 = new Temporada();
        t2.addEpisodio(ep5);
        t2.addEpisodio(ep6);
        t2.addEpisodio(ep7);
        t2.addEpisodio(ep8);

        Serie s1 = new Serie("Bla", "Bla", "Bla", "Bla");

        s1.addTemporada(t1);

        System.out.println(s1.episodiosVistos());
        System.out.println(s1.obtenerPromedioCalificaciones());
        System.out.println(t1.obtenerPromedioCalificaciones());
    }
}
