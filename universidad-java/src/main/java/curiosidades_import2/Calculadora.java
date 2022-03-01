package curiosidades_import2;

public class Calculadora {

	public static void sumar(Integer numero1, Integer numero2) {
		System.out.println(numero1 + " + " + numero2 + " = " + (numero1 +  numero2));
	}
	
	public static void restar(Integer numero1, Integer numero2) {
		System.out.println(numero1 + " - " + numero2 + " = " + ((numero1 > numero2)? numero1 - numero2 : numero2 -  numero1 ));
	}
	
}
