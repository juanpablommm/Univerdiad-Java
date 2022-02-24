package com.gom.ventas;

public class Ventas {

	public static void main(String[] args) {
		Producto producto = new Producto("Televisor", 1.5890);
		Producto producto1 = new Producto("lavadora", 4.5890);
		Producto producto2 = new Producto("Celular", 1.1290);
		Producto producto3 = new Producto("Barra de Sonido", 5.5890);
		Producto producto4 = new Producto("XBOX X", 4.9990);
		Producto producto5 = new Producto("PS3", 2.76649);
		Producto producto6 = new Producto("Guitarra", 589.000);
		Producto producto7 = new Producto("Piano", 1.5890);
		Producto producto8 = new Producto("Mp3", 90.523);
		Producto producto9 = new Producto("Vocinas", 58.190);
		Producto producto10 = new Producto("Airoman muñeco", 90.123);
		
		Orden orden1 = new Orden();
		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		orden1.agregarProducto(producto3);
		orden1.agregarProducto(producto4);
		orden1.agregarProducto(producto5);
		
		
		Orden orden2 = new Orden();
		orden2.agregarProducto(producto6);
		orden2.agregarProducto(producto7);
		orden2.agregarProducto(producto8);
		orden2.agregarProducto(producto9);
		orden2.agregarProducto(producto10);
		
		orden1.mostrarOrden();
		System.out.println("");
		orden2.mostrarOrden();

	}

}
