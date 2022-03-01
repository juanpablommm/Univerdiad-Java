package com.gom.ventas;

public class Producto {
	private final int idProducto; //dado que este atributo no sera modificado
	//se establece como final, una vez se cree el objeto, la variable tomara
	//un valor y no se podra modificar mas
	private String nombre;
	private double precio;
	private static int contadorProductos;
	
	private Producto() {
		this.idProducto = ++Producto.contadorProductos;
	}

	public Producto(String nombre, double precio) {
		this();//para llamar a un contructor de la clase dentro de otro
		//se debe establecer como la primera liena en este.
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public static int getContadorProductos() {
		return Producto.contadorProductos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [idProducto=");
		builder.append(idProducto);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", precio=");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	}
	
	
}
