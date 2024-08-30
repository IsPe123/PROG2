package figurasHerencia;

public class Figura {
	String nombre;
	
	public Figura(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getArea() {
		return 0;
	}
	
	public double getPerimetro() {
		return 0;
	}
	
	public String getDatosCompletos() {
		return "Nombre: " + this.nombre + " Area: " + this.getArea() + " Perimetro: " + this.getPerimetro();
	}
	

}
