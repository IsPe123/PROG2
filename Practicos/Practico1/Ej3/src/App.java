public class App {
    public static void main(String[] args) {
        PuntoGeometrico p1 = new PuntoGeometrico(2, 2);
        System.out.println(p1.calcularDistanciaEuclidea(1.5, 1.9));

        PuntoGeometrico p2 = new PuntoGeometrico(2, 2);
        PuntoGeometrico p3 = new PuntoGeometrico(4, 6);

        PuntoGeometrico p4 = new PuntoGeometrico(2, 4);
        PuntoGeometrico p5 = new PuntoGeometrico(6, 8);

        Rectangulo r1 = new Rectangulo(p2, p3);
        Rectangulo r2 = new Rectangulo(p4, p5);
        System.out.println(r1.calcularArea());
        System.out.println(r1.compararRectangulo(r2));
        System.out.println(r2.esUnCuadrado());
    
    }
}
