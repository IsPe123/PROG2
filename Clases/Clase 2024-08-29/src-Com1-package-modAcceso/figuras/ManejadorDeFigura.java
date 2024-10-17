package figuras;

import figuras.f2d.Circulo;

public class ManejadorDeFigura {
	public void mostrarInformacion(Figura f) {
		//System.out.println(f.getDatosCompletos());
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		// Instanciamos el manejador
		ManejadorDeFigura manejador = new ManejadorDeFigura();
		
		// Crear un circulo
		Circulo c1 = new Circulo(10, "C1");
		
		manejador.mostrarInformacion(c1);
		
		// Accedo al metodo getArea
		c1.metodoDePrueba();	
	}
}
