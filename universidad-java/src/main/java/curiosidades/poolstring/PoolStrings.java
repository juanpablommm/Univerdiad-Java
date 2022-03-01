package curiosidades.poolstring;

public class PoolStrings {

	public static void main(String[] args) {
		
//		Cada vez que utlizamos un objeto String al modificarlo
//		en realidad no modificamos el mismo objeto, sino
//		que se nos retornar una instancia diferente de string,
//		pues se crea un pool de string cada vez que modificamos
//		una cadena, pero si creamos un nuevo objeto string con
//		le mismo texto, se revizara en el pool si ya esiste una string 
//		con ese contenido de ser asi, nos deveulve la refencia de ese
//		String y no un nuevo objeto.
		
		Persona persona1 = new Persona("juan", "montoya" , 21);
		Persona persona2 = new Persona("juan", "montoya" , 31);
		
		System.out.println(persona1 == persona2);
		System.out.println(persona1.equals(persona2));
		
		String string = "hola";
		String string2 = "hola";
		System.out.println(string == string2); //string y string2 no son dos objetos
												//diferentes a pesar que los creamos
												//sigen siendo el mimso objeto string
												//dado que se encontro en el pool de String
		System.out.println(string.equals(string2));
	}
}
