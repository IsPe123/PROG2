package figuras.f2d;

import figuras.f2d.raras.MedioCirculo;

public class Principal2D {
	
	public static void main(String[] args) {
		// Crear un circulo
		Circulo c1 = new Circulo(10, "C1");
		
		// Accedo al metodo getArea
		c1.metodoDePrueba();
		
		MedioCirculo mc1 = new MedioCirculo(15, "MC1");
		
		mc1.otroMetodoDePrueba();

	}

}
