package figurasHerencia;

public class Rectangulo extends Figura {
	
	// Ya heredo nombre
	int base, altura;
	
	public Rectangulo(int base, int altura, String nombre) {
		super(nombre);
		this.base = base;
		this.altura = altura;
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
	
	//@Override
	public double getArea() {
		return this.base * this.altura;
	}
	
	public double getPerimetro() {
		return (this.base + this.altura) * 2;
	}
	
	public String getDatosCompletos() {
		return super.getDatosCompletos() + " Base: " + this.base + " Altura: " + this.altura;
	}
	

}
