package RepasoStatic;

public class Persona {

	private int iD_Persona;
	private String nombre, apellido;
	private static int contadorPersona;//un atributo de statico(de la clase)
								//es compratido por todos los objetos 
							//de la clase,de esta forma si se acede a el
					//desde sistintos objetos tendra el mismo valor para todos,
			//en el caso de que un objeto modifique dicho valor
		//todoso los demas veran reflejado es valor modificado, a diferencia
	//de los traibutos del objeto, que cada vez que creamos un objeto
	// se crearan distos atrbutos para cada uno de acorde al model de la clase

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		Persona.contadorPersona++;// la maera correcta de aceder a un
									// atributo static es con le nombre de la
									// clase, en lugar de la palbara this.
									// dado que es un atributo de la clase
									// pero no del objeto que se cree
		this.iD_Persona = contadorPersona;
	}

	public int getiD_Persona() {
		return iD_Persona;
	}

	public void setiD_Persona(int iD_Persona) {
		this.iD_Persona = iD_Persona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public static int getContadorPersona() {
		return contadorPersona;
	}

	@Override
	public String toString() {
		return "Persona [iD_Persona=" + iD_Persona + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
