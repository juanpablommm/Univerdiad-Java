package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {

	private int idTeclado;
	private static int contadorTeclado;

	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idTeclado = ++Teclado.contadorTeclado;
	}

	public int getIdTeclado() {
		return idTeclado;
	}

	public static int getContadorTeclado() {
		return Teclado.contadorTeclado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teclado: ");
		builder.append(super.toString());
		builder.append(", id: ");
		builder.append(idTeclado);
		return builder.toString();
	}

}
