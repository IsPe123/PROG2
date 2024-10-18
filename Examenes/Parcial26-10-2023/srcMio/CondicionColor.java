public class CondicionColor extends CondicionAbs{
    private String cc;
    
    public CondicionColor(String color) {
        this.cc = color
    }

    public boolean cumple(PiezaAbs pp) {
        return pp.getColores().contains(cc);
    }
}
