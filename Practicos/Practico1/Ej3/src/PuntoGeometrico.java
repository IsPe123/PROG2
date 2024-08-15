public class PuntoGeometrico {
    private double x;
    private double y;

    public PuntoGeometrico() {
        this.x = 0;
        this.y = 0;
    }
    
    public PuntoGeometrico(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desplazarPunto(double xPlus, double yPlus) {
        this.x += xPlus;
        this.y += yPlus; 
    }

    public double calcularDistanciaEuclidea(double xParam, double yParam) {
        double distancia = (Math.pow((this.x - xParam), 2) + Math.pow((this.y - yParam), 2));
        distancia = Math.sqrt(distancia);
        return distancia;
        //  Formula:
        //  Distancia2 = ( X1 – X2 ) 2 + (Y1 – Y2) 2 
    }
}
