package com.repoGAA.pago;

public class Pago {
	
	String Tarjeta;
	int Efectivo;
	String Bizum;
	String paypal;
	
	public Pago() {
	}

	public Pago(String tarjeta, int efectivo, String bizum, String paypal) {
		Tarjeta = tarjeta;
		Efectivo = efectivo;
		Bizum = bizum;
		this.paypal = paypal;
	}

	/**
	 * @return the tarjeta
	 */
	public String getTarjeta() {
		return Tarjeta;
	}

	/**
	 * @param tarjeta the tarjeta to set
	 */
	public void setTarjeta(String tarjeta) {
		Tarjeta = tarjeta;
	}

	/**
	 * @return the efectivo
	 */
	public int getEfectivo() {
		return Efectivo;
	}

	/**
	 * @param efectivo the efectivo to set
	 */
	public void setEfectivo(int efectivo) {
		Efectivo = efectivo;
	}

	/**
	 * @return the bizum
	 */
	public String getBizum() {
		return Bizum;
	}

	/**
	 * @param bizum the bizum to set
	 */
	public void setBizum(String bizum) {
		Bizum = bizum;
	}

	/**
	 * @return the paypal
	 */
	public String getPaypal() {
		return paypal;
	}

	/**
	 * @param paypal the paypal to set
	 */
	public void setPaypal(String paypal) {
		this.paypal = paypal;
	}
	
	public void ProcesarPago(double monto) {
		if (Tarjeta != null) {
			System.out.println("Pago con tarjeta procesado: " + monto);
		}else if (Efectivo > 0) {
			System.out.println("Pago en efectivo procesado: " + monto);
		}else if (Bizum != null) {
			System.out.println("pago con Bizum procesado: " + monto);
		}else if (paypal != null) {
			System.out.println("Pago con paypal procesado: " + monto);
		}else
			System.out.println("No se encontro ningun metodo de pago valido.");
	}

}
