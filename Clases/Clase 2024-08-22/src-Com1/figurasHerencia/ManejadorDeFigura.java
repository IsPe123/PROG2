package figurasHerencia;

public class ManejadorDeFigura {
	public void mostrarInformacion(Figura f) {
		System.out.println(f.getDatosCompletos());
	}
	
	public static void main(String[] args) {
		// Instanciamos el manejador
		ManejadorDeFigura manejador = new ManejadorDeFigura();
		
		// Crear un rectangulo
		Rectangulo r1 = new Rectangulo(10, 5, "R1");
		
		manejador.mostrarInformacion(r1);
		
		Figura c1 = new Circulo(20, "C1");
		
		System.out.println(((Circulo)c1).getDiametro());
		
		manejador.mostrarInformacion(c1);
		
		c1 = new Rectangulo(15,20, "r2");
		
		manejador.mostrarInformacion(c1);
		
		//Circulo cf = new Figura("F");
		
		Figura sm = new MedioCirculo(3, "mc1");
		manejador.mostrarInformacion(sm);
		
		Circulo mc1 = (MedioCirculo)sm; // Si sm no referencia a un MedioCirculo o una subclase de esta hay un error en tiempo de ejecucion
		
		
	}
}
