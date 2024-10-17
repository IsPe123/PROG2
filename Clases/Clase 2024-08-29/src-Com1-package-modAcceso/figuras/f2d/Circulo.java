package figuras.f2d;

public class Circulo extends Figura2D {
	protected int radio;
	
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
	
	public String toString() {
		return super.toString() + " Radio: " + this.radio;
	}
	
	// Probar acá los distintos modificadores de acceso
	public void metodoDePrueba() {
		System.out.println("Analizando la visibilidad");
	}
	
	public void otroMetodoDePrueba() {
		System.out.println("Este es otro...");
		this.metodoDePrueba();
	}

}
