package clientes;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println(Cliente.getContadorCliente());
		
		Cliente cl1 = new Cliente("Ariel", "Tandil");
		//Cliente.getContadorCliente();
		Cliente cl2 = new Cliente("Juan", "Tandil");
		System.out.println(cl1);
	}

}
