package ejercico_repaso_herencia;

public class Persona extends Object{

	protected String nombre, apellido, direccion;
	protected Integer edad;
	protected char genero;
	
	
	public Persona(String nombre, String apellido, String direccion, Integer edad, char genero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.genero = genero;
	}

	public Persona() {
		super();
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", apellido=");
		builder.append(apellido);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("] referenaica en memeoria: ");
		builder.append(super.toString());
		return builder.toString();
	}

	
}
