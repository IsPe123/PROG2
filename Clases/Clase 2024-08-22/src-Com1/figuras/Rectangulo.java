package figuras;

public class Rectangulo {
	private int base;
	private int altura;
	private String nombre;
	
	public Rectangulo(int base, int altura, String nombre) {
		this.base = base;
		this.altura = altura;
		this.nombre = nombre;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getArea() {
		return this.base * this.altura;
	}
	
	public double getPerimetro() {
		return (this.base + this.altura) * 2;
	}
	
	public String getDatosCompletos() {
		return "Nombre: " + this.nombre + " Area: " + this.getArea() + " Perimetro: " + this.getPerimetro() + " Base: " + this.base + " Altura: " + this.altura;
	}

}
