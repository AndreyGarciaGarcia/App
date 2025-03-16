package com.repoGAA.tipoTicket;

public class tipoTicket {
	
	String Tipo;
	int Costo;
	
	public tipoTicket() {
	}

	public tipoTicket(String tipo, int costo) {
		Tipo = tipo;
		Costo = costo;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return Tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	/**
	 * @return the costo
	 */
	public int getCosto() {
		return Costo;
	}

	/**
	 * @param costo the costo to set
	 */
	public void setCosto(int costo) {
		Costo = costo;
	}
	
	public void elegirTipo() {
		System.out.println("Tipo de ticket elegido " + Tipo + " - " + " costo " + Costo);
	}

}
