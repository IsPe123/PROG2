public class EquipoTacticoEspecial extends EquipoTactico {

    public EquipoTacticoEspecial(String nn) {
        super(nn);
    }

    @Override
    public int getTalle() {
        return trajes.get(0).getTalle();
    }

}
