import java.util.ArrayList;

import filtros.Filtro;

public class PiezaSimple extends PiezaAbs {
    private int cantidadPLA;
    private String color;
    private int tiempo;

    public PiezaSimple(String nn, String dd, int cant, String col, int tt) {
        super(nn, dd);
        this.cantidadPLA = cant;
        this.color = col;
        this.tiempo = tt;
    }

    public int getCantidadPLA() {
        return cantidadPLA;
    }
    public void setCantidadPLA(int cantidadPLA) {
        this.cantidadPLA = cantidadPLA;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public ArrayList<String> getColores() {
        ArrayList<String> respuesta = new ArrayList<String>();
        respuesta.add(this.color);
        return respuesta;
    }

    @Override
    public ArrayList<PiezaSimple> buscar(Condicion cc) {
        ArrayList<PiezaSimple> respuesta = new ArrayList<PiezaSimple>();
        if (cc.cumple(this)) {
            respuesta.add(this);    
        }
        return respuesta;
    }

    @Override
    public int contarPiezasSimples() {
        return 1;
    }
    
    
    /* 
 
    PiezaSimple ext PiezaAbs
        -int cantidadPLA
        -String color
        -int tiempo
        
        +getCantidadPLA()
        +getColor()
        +getTiempo()
        +getColores()         @Override
        +buscar(Condicion cc) @Override
        +contarSimples()      @Override
     */
}
