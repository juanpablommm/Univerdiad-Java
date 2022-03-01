package ejerciciosbasicos;

import java.util.Scanner;

public class Ejercicio2Libro {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Proporciona el nombre: ");
		var nombre = teclado.nextLine();

		System.out.print("Proporciona el id: ");
		int id = (int) comprobarTiposNumericos(teclado);

		System.out.print("Proporciona el precio:");
		var precio = comprobarTiposNumericos(teclado);

		System.out.print("Proporciona el envio gratuito? T.(true)  F.(false)");
		var envio = teclado.nextLine();
		while (!envio.equalsIgnoreCase("F") && !envio.equalsIgnoreCase("T")) {
			System.out.println("Error! opcion invalidad, seleciona nuevamente: *T  *F");
			envio = teclado.next();
		}
		
		System.out.println("------------------------------"
				+ "\nLibro:");
		System.out.println(new Libro(nombre, id, precio, opcionGratuito.valueOf(envio.toUpperCase()).isEleccion()));

	}
	
	private static float comprobarTiposNumericos(Scanner teclado) {
		String regularExpresion = "[+-]?\\d*(\\.\\d+)?";
		String variable = teclado.nextLine();
		while (!variable.matches(regularExpresion) || variable.equals("")) {
			System.out.println("Error! solo valores numericos, ingresa nuevamente el dato");
			variable = teclado.nextLine();
		}
		return Float.parseFloat(variable);
	}
}

class Libro{
	private String nombre;
	private Integer id;
	private Float precio;
	private Boolean envio;
	
	public Libro(String nombre, Integer id, Float precio, Boolean envio) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.precio = precio;
		this.envio = envio;
	}

	@Override
	public String toString() {
		return "nombre:" + nombre + "\nid:" + id + "\nprecio:" + precio + "\nenvio:" + envio;
	}
	
	
}


enum opcionGratuito {
	T(true), F(false);
	private boolean eleccion;

	private opcionGratuito(boolean eleccion) {
		this.eleccion = eleccion;
	}
	public boolean isEleccion() {
		return eleccion;
	}
}
