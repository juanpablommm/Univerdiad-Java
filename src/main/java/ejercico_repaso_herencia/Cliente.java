package ejercico_repaso_herencia;

import java.util.Date;

public class Cliente extends Persona{

	private Integer iD_Cliente;
	private Boolean vip;
	private Date fechaRegistro;
	private static Integer contadorCliente = 0;
	
	public Cliente() {
	}
	
	public Cliente(String nombre, String apellido, String direccion, Integer edad, char genero, Boolean vip, Date fechaRegistro) {
		super(nombre, apellido, direccion, edad, genero);
		this.vip = vip;
		this.fechaRegistro = fechaRegistro;
		this.iD_Cliente = ++Cliente.contadorCliente;
	}

	public Boolean getVip() {
		return vip;
	}

	public void setVip(Boolean vip) {
		this.vip = vip;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Integer getiD_Cliente() {
		return iD_Cliente;
	}

	public static Integer getContadorCliente() {
		return Cliente.contadorCliente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", iD_Cliente=");
		builder.append(iD_Cliente);
		builder.append(", vip=");
		builder.append(vip);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append("]");
		return builder.toString();
	}
			
}
