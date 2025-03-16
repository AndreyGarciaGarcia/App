package com.repoGAA.ticket;

public class Ticket {
	
	int hora;
	String Lugar;
	int Codigo;
	String Tipo;
	
	
	public Ticket() {
	}

	public Ticket(int hora, String lugar, int codigo, String tipo) {
		this.hora = hora;
		Lugar = lugar;
		Codigo = codigo;
		Tipo = tipo;
	}

	/**
	 * @return the hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return Lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		Lugar = lugar;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return Codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		Codigo = codigo;
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
	
	public void ComprarTicket() {
		System.out.println("Ticket comprado " + Codigo + " - " + Tipo);
	}

	public void AnularTicket() {
		System.out.println("Ticket anulado " + Codigo);
	}
}
