package com.gom.ventas;

public class Producto {
	private static Long idProducto;
	private String nombre;
	private Double precio;
	
	private Producto() {
		++Producto.idProducto;
	}

	public Producto(String nombre, Double precio) {
		super();
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

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public static Long getIdProducto() {
		return idProducto;
	}
	
}
