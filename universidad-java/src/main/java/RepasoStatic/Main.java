package RepasoStatic;

public class Main {

//	los atributos y metodos staticos se
//	asocian con la clase mas no con los objetos
//	por lo que se menciona el contexto statico y el contexto dinamico:
//	el contexto estatico se asocia a la carga de clases, (ClassLoader)
//	y el contexto dinamico se asocia a la carga de objettos.
//	el contexto estatico es carga primero que el dinamico, por lo
//	que es por esa razon que no podemos acerder a un metodo o atributo
//	de un objeto desde un metodo statico (de la clase).
//	Pero si es posible aceder a un metodo statico desde el contexto dinamico
//	dado que este ya ha sido creado primero

	public static void main(String[] args) {
		Persona persona1 = new Persona("juan", "montoya");
		System.out.println(persona1);
		Persona persona2 = new Persona("Jonhy Bravo", "El bravo");
		System.out.println(persona2);
		Persona persona3 = new Persona("dead", "pool");
		System.out.println(persona3);
		System.out.println(Persona.getContadorPersona());//para acedder a un
													//metodo o atributo
												//estatico lo correcto
											//es tulizar el nombre
										//de la clase y no el del obtjeto
	}
}
