package com.gm.mundopc;

public class Computador {

	private int idComputador;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static int contadorComputador;

	public Computador(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
		this.idComputador = ++Computador.contadorComputador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Raton getRaton() {
		return raton;
	}

	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	public int getIdComputador() {
		return idComputador;
	}

	public static int getContadorComputador() {
		return contadorComputador;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computador: ");
		builder.append(nombre);
		builder.append(", monitor=");
		builder.append(monitor);
		builder.append(", teclado=");
		builder.append(teclado);
		builder.append(", raton=");
		builder.append(raton);
		builder.append(", id: ");
		builder.append(idComputador);
		return builder.toString();
	}
}
