package com.repoGAA.descuento;

public class Descuento {
	
	private int puntos;
	double porcentajeDescuento;
	
	public Descuento() {
	}

	public Descuento(int puntos, double porcentajeDescuento) {
		this.setPuntos(puntos);
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	public double descuentoTotal(double monto) {
		return monto * (porcentajeDescuento / 100);
	}
	
	public void agragarPunto(int nuevosPuntos) {
		this.setPuntos(this.getPuntos() + nuevosPuntos);
		System.out.println("Puntos actualizados: " + this.getPuntos());
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	

}
