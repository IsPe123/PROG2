package figuras;

public class Circulo {
	int radio;
	String nombre;
	
	public Circulo(int radio, String nombre) {
		this.radio = radio;
		this.nombre = nombre;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDiametro() {
		return radio * 2;
	}
	
	public double getArea() {
		return Math.PI * this.radio * this.radio;
	}
	
	public double getPerimetro() {
		return 2 * Math.PI * this.radio;
	}
	
	public String getDatosCompletos() {
		return "Nombre: " + this.nombre + " Area: " + this.getArea() + " Perimetro: " + this.getPerimetro() + 
				" Radio: " + this.radio;
	}
}
