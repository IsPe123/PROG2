package figurasHerencia;

public class Circulo extends Figura {
	int radio;
	
	public Circulo(int radio, String nombre) {
		super(nombre);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
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
		return super.getDatosCompletos() + " Radio: " + this.radio;
	}

}
