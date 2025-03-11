import java.util.ArrayList;

public class RequisitoMetal extends Requisito {
    
    private String metal;

    public RequisitoMetal(String mm) {
        this.metal = mm;
    }

    @Override
    public boolean cumple(Miembro mm) {
        ArrayList<String> aux = new ArrayList<>(mm.getMetales());
        return aux.contains(metal);
    }
}
