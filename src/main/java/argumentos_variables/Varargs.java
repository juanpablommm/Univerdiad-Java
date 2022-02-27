package argumentos_variables;

public class Varargs {

	public static void main(String[] args) {
		argumentoVariable(1, 2, 3, 4, 5, 6, 7, 8, 9);//se pasan n cantida de 
//		argumentos del mismo tipo, sin tener que crear un arreglo, siendo una
//		sintaxis mas limpia
	
		System.out.println("segundo ejemplo de varargs");
		argumentoVariable2("jhony", "el bravo", 1, 2, 3, 4, 5,2);
	}
	
	//Argumentos variables
//	los argumentos varibles nos permiten pasar un numero indefinido
//	de variables del mismo tipo como argumentos a un metodo,
//	lo que hace esto es que se internamente dentro del metodo
//	el argumento varible se combierte en un arreglo unidimencional
//	(vector), el cual podemos intear con total normalidad con un bucle
	private static void argumentoVariable(int... numeros){
		for(int numero: numeros) {
			System.out.print(numero + ", ");
		}
	}
	
	
	//cuando tenemos un metodo que recive un argumento varibe junto con mas argumentos,
//	el argumento variable tiene que ir de ultimo, de lo contario nos arrojara error
	private static void argumentoVariable2(String nombre, String apellido, int...edades) {
		for(int dato: edades) {
			System.out.print(nombre + " " + apellido + " " + dato + ", ");
		}
	}
}
