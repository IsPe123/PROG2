public class Rectangulo {
    private PuntoGeometrico p1;
    private PuntoGeometrico p2;

    public Rectangulo(PuntoGeometrico p1, PuntoGeometrico p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    //Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e Y.
    public void desplazar(double xPlus, double yPlus) {
        this.p1.desplazarPunto(xPlus, yPlus);
        this.p2.desplazarPunto(xPlus, yPlus);
    }

    //Calcular el Área del rectángulo.
    public double calcularArea() {
        return (this.p2.getX() - this.p1.getX()) * (this.p2.getY() - this.p1.getY());
    }
    
    //Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son iguales y -1 si es
    //menor. Se dice que un rectángulo es mayor que otro si el área del mismo es mayor que la del otro. 
    public int compararRectangulo(Rectangulo rectangulo2) {
        if (this.calcularArea() > rectangulo2.calcularArea()) {
            return 1;
        } else if (this.calcularArea() < rectangulo2.calcularArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    //Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las
    //propiedades para que sea un cuadrado.
    public boolean esUnCuadrado() {
        return (this.p2.getX() - this.p1.getX()) == (this.p2.getY() - this.p1.getY());
    }

    //Determinar el largo del lado superior
    public double largoSuperior() {
        return p2.getX() - p1.getX();
    }

    //Determinar si está acostado o parado (si el alto es más que el ancho). 
    public String ladoMasLargo() {
        if (p2.getX() - p1.getX() > p2.getY() - p1.getY()) {
            return "El rectangulo esta acostado";
        } else if (p2.getX() - p1.getX() < p2.getY() - p1.getY()) {
            return "El rectangulo esta parado";
        } else {
            return "Miden lo mismo, por ende son un cuadrado :D";
        }
    }

}