package repaso_palabra_final;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Jonhy", "Bravo", 21, 01l, 4.560f);
		System.out.println(cliente);
//		cliente.jefe = 9; //nos muestra error dado que un atributo final noo
//		puede ser modificado
		System.out.println("Jefes: " + Cliente.jefe);
		
		
	}
}
