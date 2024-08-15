public class App {
    public static void main(String[] args) {
        Electrodomestico e1 = new Electrodomestico("Heladera Sony", 500000, "Gris claro", 300, 110);
        
        System.out.println(e1.calcularBalance());
        System.out.println(e1.esAltaGama());
        System.out.println(e1.esBajoConsumo());
    }
}
