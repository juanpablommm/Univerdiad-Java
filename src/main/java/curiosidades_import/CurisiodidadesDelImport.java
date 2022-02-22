package curiosidades_import;

//import curiosidades_import2.Calculadora; impor normal


//cuando necesitamos trabajar con algun metodo del contexto statico de 
//una clase, pordemos hacer la importacion directmante de es metodo
//pra no tener que utilizar el nombre de la clase y metodo mas adelante
//en el codigo, sino que simplemente basta con el nombre del metdodo o
//atrbituto estatico que necesitemos
import static curiosidades_import2.Calculadora.sumar;// solo se importa el metodo 
													//o atributo

//import curiosidades_import2.Calculadora;

public class CurisiodidadesDelImport {
	
	public static void main(String[] args) {
//		Calculadora.sumar(4, 9);// con el nombre de la clase
		
		sumar(4, 9);// con el nombre del metodo simplemente
		
		
		
//		cabe resaltar la importacion por el nombre sxplicito pero 
//		no se recomienda por la confuciion y estructuramiento del codigo
		curiosidades_import2.Calculadora.restar(4, 9);
		
	}
	

}
