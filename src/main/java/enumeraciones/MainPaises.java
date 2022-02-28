package enumeraciones;

public class MainPaises {

	public static void main(String[] args) {

		System.out.println("CONTINENTES Y PAISES");
		
		//values(), nos devuelve un arreglo de todos los elementos del Enum
		Continentes[] continentes = Continentes.values();
		for(Continentes continente: continentes) {
			System.out.println(continente + ": " + continente.getPaises()  + " Paises y " + continente.getHabitantes() + " millones de habitantes");
		}
		
		//valuesOf(String), nos permite pasado una cadena saber si se es una constante del Enum
		//si el Enums no contiene la ocnstante con el nombre del string lanzara una Exception
		//(java.lang.IllegalArgumentException), de lo contraio si exite devolvera la contante
		Continentes continentes2 = Continentes.valueOf("EUROPA");
		System.out.println(continentes2);
		
		//ordinal(), nos devuelve el indice de la constante en el roden que 
//		fueron declaradas
//		AMERICA(35, 1.002), 
//		EUROPA(46, 447.3), 
//		ASIA(48, 4.561),
//		OCEANIA(14, 4.56),
//		AFRICA(54, 1.216);
		int indice = Continentes.AFRICA.ordinal();
		System.out.println(indice);
		
		
//		compareTo(), nos devuelve un  valor entero de la siguiente forma;
//		*si la constante de invocacion tiene un valor ORDINAL menor que la que se
//		pasa por parametro, entonces nos devuelve un numero negativo.
//		*si la constante de invocacion tien un valor ORDINAL mayor que la que se
//		pasa por parametro entonces nos devuelve un numero positivo
//		*si son iguales devuelve 0
		int compare = Continentes.OCEANIA.compareTo(Continentes.AFRICA);
//		OCENANIA = 3 Y AFRICA = 4 (3 < 4) = (3 - 4) -1
		System.out.println(compare);
		
		compare = Continentes.AMERICA.compareTo(Continentes.AFRICA);
//		AMERICA = 0 Y AFRICA = 4 = (0 < 4) = 0 -4 = -4
		System.out.println(compare);

		
//		name(), el metodo name, nos devuelve un string con el nombre de
//		la constante, de misma manera podemos emplear el toString, que ha 
//		sido sobreescribido en la Enum.class para solo devolver el string
//		con el nombre de la constante
		String nombre = Continentes.AMERICA.name();
		System.out.println(nombre);
		
		nombre = Continentes.AFRICA.toString();
		System.out.println(nombre);
		
		//getDeclaringClass(), nos devuelve el .class de el enums que utlicemos
		System.out.println(Continentes.AFRICA.getDeclaringClass().getSimpleName());
		
		
	}
	

}
