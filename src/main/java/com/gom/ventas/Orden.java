package com.gom.ventas;

import java.text.DecimalFormat;

public class Orden {

	private int idOrden;
	private Producto productos[];
	private static int contadorOrden;
	private static int contadorProducto;
	private final static Integer MAX_PRODUCTOS = 10;
	
	
	public Orden() {
		this.idOrden = ++Orden.contadorOrden;
		this.productos = new Producto[Orden.MAX_PRODUCTOS];
	}
	
	public void agregarProducto(Producto producto) {
		if(contadorProducto < productos.length) {
			productos[Orden.contadorProducto++] =  producto;
		}else {
			System.out.println("Maximo de productos superado: " + Orden.contadorProducto);
		}
	}
	
	private double calcularTotal() {
		double valorTotal = 0;
		for(Producto producto: productos) {
			valorTotal += (producto != null)? producto.getPrecio(): 0;
		}return valorTotal;
	}
	
	public void mostrarOrden(){
		System.out.println("ID de Orden: " + this.idOrden);
		System.out.println("Productos: ");
		for(Producto producto: productos) {
			if(producto != null) {
				System.out.println("*" + producto.getNombre() + " $"+ producto.getPrecio());
			}
		}
		System.out.println("Valor total: $" + new DecimalFormat("###.###").format(this.calcularTotal()));
	}
	
}
