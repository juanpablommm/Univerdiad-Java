package bloques_inicializacion;

public class BloquesDeInicializacion {

	private static int varStatic;
	private int varDinamica;
//
//	los bloques de inicilizacion siempre se ejecutna primero que el constructor,
//	sin importar el roden en que se escriban, el bloque de inicializacion
//	sera ejecuta primero que el onstructor; pero si ahy un bloque incilizacion statico
//	se jecutara primero que el no estatico, recordando el contexto estatico y dinamico.
//	Se estan inicilizando atributos de la clase mas no del objeto.
//	Como ultimo punto ahy que recordar que los bloques de inicilizacion no reciben 
//	parametros
	
	
//	bloque de inicilizacion estatico
	static {
		System.out.println("Se ejecuta bloque statico ");
		BloquesDeInicializacion.varStatic = 20;
	}

//	bloque de inicializacion no estatico (dinamico)
	{
		System.out.println("Se ejecuta bloque no static, (dinamico)");
		this.varDinamica = ++BloquesDeInicializacion.varStatic;
		
	}
	public BloquesDeInicializacion() {
		System.out.println("Se ejecuta constructor");
	}
	public static int getVarStatic() {
		return varStatic;
	}
	public int getVarDinamica() {
		return varDinamica;
	}
	
}
