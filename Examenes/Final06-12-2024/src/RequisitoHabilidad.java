public class RequisitoHabilidad extends Requisito {

    private String habilidad;

    public RequisitoHabilidad(String hh) {
        this.habilidad = hh;
    }

    @Override
    public boolean cumple(Miembro mm) {
        return mm.getHabilidad().equals(habilidad);
    }
    
}
