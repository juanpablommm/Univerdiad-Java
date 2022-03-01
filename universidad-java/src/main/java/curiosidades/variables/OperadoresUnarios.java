package curiosidades.variables;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
//		invertir valor
		int a = 12;
		int b = -a;
		System.out.println("a = " + a);
		System.out.println("b = -a = " + b);
		
//		negacion
		boolean miBoolean = true;
		boolean miBoolean2 = !miBoolean;
		System.out.println("mi boolean = " + miBoolean);
		System.out.println("mi boolean2 = " + miBoolean2);
		
//		predecremento(incremento) y posdecremento(incremento)
//		predequemento
		int i = 4;
		int j = --i; //primero decrementa la variable y depues se usa
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
//		posdecremento
		int t = 4;
		int r = i--; //primero utiliza la variable y despues se decrementa
		System.out.println("t = " + t);
		System.out.println("r = " + r);
		
	}

}
