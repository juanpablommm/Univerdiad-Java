package com.gm.mundopc;

public class Raton extends DispositivoEntrada {

	private int idRaton;
	private static int contadorRatones;

	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idRaton = ++Raton.contadorRatones;

	}

	public int getIdRaton() {
		return idRaton;
	}

	public static int getContadorRatones() {
		return Raton.contadorRatones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Raton: ");
		builder.append(super.toString());
		builder.append(", id: ");
		builder.append(idRaton);
		return builder.toString();
	}
	
}
