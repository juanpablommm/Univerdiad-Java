package bloques_inicializacion;

public class BloquesDeInicializacionMain {

	public static void main(String[] args) {
		BloquesDeInicializacion b = new BloquesDeInicializacion();
		System.out.println(b.getVarDinamica());
		
		//al crear un segundo objeto de la clase BloquesDeInicializacion 
//		ya no se ejecura ale mensaje del bloque inicilizador sstatico
		
		System.out.println("creacion del segundo objeto ");
		BloquesDeInicializacion b2 = new BloquesDeInicializacion();
		System.out.println(b2.getVarDinamica());
		
	}
	
}
