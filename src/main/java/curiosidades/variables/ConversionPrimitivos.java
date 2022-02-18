package curiosidades.variables;

public class ConversionPrimitivos {
	public static void main(String[] args) {
		
//		valeOf de un tipo primitivo a String
		int miIntero = 12;
		String miString = String.valueOf(miIntero);
		System.out.println("En entero = " + (miIntero + 3) + " en String =" + (miString + 1));
	
		
//		Parseo de un String a un tipo Primitivo
		double miDouble = Double.parseDouble(miString);
		System.out.println("con parseo " + miDouble);
		byte miByte = Byte.parseByte(miString);
		System.out.println("con parseo " + miByte);
		boolean m = Boolean.parseBoolean(miString);
		System.out.println(m);
		boolean miBoolean = Boolean.parseBoolean("true");
		System.out.println(miBoolean);
		
		
		
//		casting cualquier primitivo a otro primitivo
		miDouble = 231.90;
		System.out.println(miDouble);
		int miInt = (int) miDouble;
		System.out.println("con casting " + miInt);
		float miFloat = (float) miInt;
		System.out.println(miFloat);
		
	}
}