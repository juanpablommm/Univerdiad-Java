package repaso_palabra_final;

public class Persona {

	private String nombre, apellido;
	private Integer edad;
	
	
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido, Integer edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
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
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	
	//la palabra final a nivel de metodo, nos sirve para indicar
//	que la clase hija que estienda de esta no podra, sobreescribir el 
//	metodo, tendra que utilizarlo tal y como la
//	clase padrelo tiene
	public final void hablar() {
		System.out.println("Hola, yo hablo español, como estas?");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", apellido=");
		builder.append(apellido);
		builder.append(", edad=");
		builder.append(edad);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
