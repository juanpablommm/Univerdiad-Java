package com.gm.mundopc;

public class Monitor {

	private int idMonitor;
	private String marca;
	private double tamano;
	private static int contadorMonitores;

	public Monitor(String marca, double tamano) {
		this.marca = marca;
		this.tamano = tamano;
		this.idMonitor = ++Monitor.contadorMonitores;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	public int getIdMonitor() {
		return idMonitor;
	}

	public static int getContadorMonitores() {
		return contadorMonitores;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Monitor: ");
		builder.append(marca);
		builder.append(", tamano=");
		builder.append(tamano);
		builder.append(", id: ");
		builder.append(idMonitor);
		return builder.toString();
	}

}
