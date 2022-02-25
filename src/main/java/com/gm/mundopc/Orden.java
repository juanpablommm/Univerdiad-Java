package com.gm.mundopc;

public class Orden {

	private int idOrden;
	private Computador[] computadores;
	private int contadorCompudadores;
	private static int contadorOrden;
	private static final int MAX_COMPUTADORES = 5;

	public Orden() {
		this.idOrden = ++Orden.contadorOrden;
		this.computadores = new Computador[Orden.MAX_COMPUTADORES];
	}

	public Computador[] getComputadores() {
		return computadores;
	}

	public void setComputadores(Computador[] computadores) {
		this.computadores = computadores;
	}

	public int getIdOrden() {
		return idOrden;
	}

	public int getContadorCompudadores() {
		return contadorCompudadores;
	}

	public static int getContadorOrden() {
		return contadorOrden;
	}

	public static int getMaxComputadores() {
		return MAX_COMPUTADORES;
	}

	public void agregarComputador(Computador computador) {
		if (contadorCompudadores < this.computadores.length) {
			this.computadores[contadorCompudadores++] = computador;
		} else {
			System.out.println("No se puede agregar mas computadores: " + contadorCompudadores);
		}
	}

	public void mostrarOrden() {
		System.out.println("ID de Orden: " + this.idOrden);
		System.out.println("Computadores: ");
		for (Computador computador : this.computadores) {
			if (computador != null) {
				System.out.println("----------------------------------------------------------------------------------------------------------");
				System.out.println("*" + computador);
				System.out.println("----------------------------------------------------------------------------------------------------------");
			}

		}
	}
}