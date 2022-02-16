package curiosidades.variables;

public class CaracteresEspeciales {

	public static void main(String[] args) {
//		CARACTERES ESPECIALES PARA LOS STRING
		
//		Salto de linea
//		para el salto de linea utilizamos \n
		String nombre = "juan pablo";
		System.out.println("el nombre del aprendiz es: " + nombre);
		System.out.println("el nombre del aprendiz es: \n" + nombre);
		
//		tabulacion
//		para la tabulacion podemos usar el \t
		System.out.println("el nombre del aprendiz es: " + nombre);
		System.out.println("el nombre del aprendiz es: \t" + nombre);
		
//		retroceso
//		para el retroceso de un caracter utilizamos el \b
		System.out.println("el nombre del aprendiz es: " + nombre);
		System.out.println("el nombre del aprendiz es:\b" + nombre);
		
		
//		comillas dobles en el mensaje y comillas simples
//		para imprimir commillas dobles utilizamos el \"
//		de esta manera las commilas que querramos mosgrar no romperan
//		las del mensaje
		System.out.println("el nombre del aprendiz es: '" + nombre + "'");
		System.out.println("el nombre del aprendiz es: \"" + nombre + "\"");
	}
}
