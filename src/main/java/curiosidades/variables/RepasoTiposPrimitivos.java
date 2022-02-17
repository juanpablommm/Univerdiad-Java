package curiosidades.variables;

public class RepasoTiposPrimitivos {
	public static void main(String[] args) {

//		Tipos enteros 
//		byte
		System.out.println("valor minimo de un byte " + Byte.MIN_VALUE);
		System.out.println("valor maximo de un byte " + Byte.MAX_VALUE);
//		si realizamos un casting para un valor que supera el tipo 
//		de datos que declaramos podemos obtener otro numero todalmente
//		distinto del que damo, por lo cual se pierde la precision
		byte miByte = (byte) 199;
		System.out.println(miByte);
		
		
//		Short
		System.out.println("valor minimo de un shot " + Short.MIN_VALUE);
		System.out.println("valor maximo de un shot " + Short.MAX_VALUE);
		short miShort = (short) 32790;
		System.out.println(miShort);
		
//		int
		System.out.println("valor minimo de un int " + Integer.MIN_VALUE);
		System.out.println("valor maximo de un int " + Integer.MAX_VALUE);
		int miInt = (int) 2147483649l;// el literal que se utliza por defecto es el int
		System.out.println(miInt);
		
//		long
		System.out.println("valor minimo de un long " + Long.MIN_VALUE);
		System.out.println("valor maximo de un long " + Long.MAX_VALUE);
		long miLong = (long) 9223372036854775809f;
		System.out.println(miLong);
		
		
//		Float
		System.out.println("valor minimo de un float " + Float.MIN_VALUE);
		System.out.println("valor maximo de un float " + Float.MAX_VALUE);
		float miFloat = (float) 3.4028235E39;
		System.out.println(miFloat);
		
//		Double
		System.out.println("valor minimo de un double " + Double.MIN_VALUE);
		System.out.println("valor maximo de un double " + Double.MAX_VALUE);
		double miDouble = 1.7976931348623157E308;
		System.out.println(miDouble);
		
		
		
	}
}