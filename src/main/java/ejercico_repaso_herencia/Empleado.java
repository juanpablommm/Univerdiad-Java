package ejercico_repaso_herencia;

public class Empleado extends Persona {

	private Integer iD_Emplead;
	private Float suledo;
	private static Integer contadorPersona = 0;
	
	
	public Empleado(String nombre, String apellido, String direccion, Integer edad, char genero, Float suledo) {
		super(nombre, apellido, direccion, edad, genero);
		this.iD_Emplead = ++Empleado.contadorPersona;
		this.suledo = suledo;
	}

	public Empleado() {
	}

	public Float getSuledo() {
		return suledo;
	}

	public void setSuledo(Float suledo) {
		this.suledo = suledo;
	}

	public Integer getiD_Emplead() {
		return iD_Emplead;
	}

	public static Integer getContadorPersona() {
		return Empleado.contadorPersona;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());//recordar que para llamar atributos, 
								//metos y contructor de la clase padre de utiliza (super)
		builder.append(", iD_Emplead=");
		builder.append(iD_Emplead);
		builder.append(", suledo=");
		builder.append(suledo);
		builder.append("]");
		return builder.toString();
	}

}
