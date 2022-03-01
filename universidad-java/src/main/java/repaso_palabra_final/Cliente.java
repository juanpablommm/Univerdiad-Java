package repaso_palabra_final;

public final class Cliente extends Persona{ //final a nivel de clase nos permite
	//cortar la linea de herencia, es decir que ninguna otra clases podra heredar
//	de una clase que tenga la palabra final en el nombre

	private Long idCliente;
	private Float sueldo;
	public static final Integer jefe = 1; //final a a nivel de varaibles nos 
//	permite que el valor de una variable no pueda ser modificado, por ende
//	al juntarla con el ambito estatico podemos crear constantes, final static
//	es decir que el atributo sera de la clase, y no de los objetos, por ende
//	el valor que vean cada uno de los objetos sera el mismo que se establecio, 
//	y sumado con la palabra final, lo que nos permitira es que ese valor no pueda
//	ser modificado.
	
	
	
	public Cliente() {
		super();
	}
	public Cliente(String nombre, String apellido, Integer edad, Long idCliente, Float sueldo) {
		super(nombre, apellido, edad);
		this.idCliente = idCliente;
		this.sueldo = sueldo;
		
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public Float getSueldo() {
		return sueldo;
	}
	public void setSueldo(Float sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [idCliente=");
		builder.append(idCliente);
		builder.append(", sueldo=");
		builder.append(sueldo);
		builder.append(super.toString());
		return builder.toString();
	}
	
//	public final void hablar() {
//		System.out.println("Hola, yo hablo español, como estas?");
//	}
//	muestra error si se intenta sobreescribir un metodo final de la clase 
//	padre, ya que el contexto final en un metodo lo que nos permite es
//	evitar esto precisamente
	
	
	
	
}
