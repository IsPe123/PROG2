package figuras;

public class ManejadorDeFigura {
	public void mostrarInformacion(Rectangulo r) {
		System.out.println(r.getDatosCompletos());
	}
	
	public void mostrarInformacion(Circulo c) {
		System.out.println(c.getDatosCompletos());
	}
	
	public static void main(String[] args) {
		// Instanciamos el manejador
		ManejadorDeFigura manejador = new ManejadorDeFigura();
		
		// Crear un rectangulo
		Rectangulo r1 = new Rectangulo(10, 5, "R1");
		
		manejador.mostrarInformacion(r1);
		
		Circulo c1 = new Circulo(20, "C1");
		
		manejador.mostrarInformacion(c1);
	}
}
