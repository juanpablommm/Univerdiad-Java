package curiosidades.variables;

public class Goto {

	public static void main(String[] args) {
		
//		Goto es una instrucion propia de los primeros lenguajes de 
//		programacion, que se ha adptado a la mayoria de lenguajes
//		de alto nivel, pero no es muy usada dado que puede generar
//		confuciones:
//		Esta consta de hacer saltar el progra a una parte especifca 
//		del codigo, utilizando el break, y el continuo
		System.out.println("cde");
		Integer miVector[] = new Integer[] {1, 2, 3, 4, 5, 6};
		inicio:
		for(Integer numero: miVector) {
			if(numero == 4) {
				break inicio;
			}
			System.out.println("ide");
		}

	}

}
