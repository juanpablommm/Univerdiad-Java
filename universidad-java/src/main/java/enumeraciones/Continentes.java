package enumeraciones;

public enum Continentes {
	AMERICA(35, 1.002), //internamente los atributos de un Enum, se definen como
	EUROPA(46, 447.3), //public final static, pues estas son constantes
	ASIA(48, 4.561),
	OCEANIA(14, 4.56),
	AFRICA(54, 1.216);
//	 La clave de los enums, es recordar que cada una de las 
//	 constantes de enumeración es un objeto del enum en que se definen
	
	private final int paises;
	private final double habitantes;

	private Continentes(int paises, double habitantes) {
		this.paises = paises;
		this.habitantes = habitantes;
	}

	public int getPaises() {
		return paises;
	}

	public double getHabitantes() {
		return habitantes;
	}
	
}
