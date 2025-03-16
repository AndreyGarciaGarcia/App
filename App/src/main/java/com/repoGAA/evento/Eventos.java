package com.repoGAA.evento;

public class Eventos {
	
	String Localizacion;
	int Hora;
	String Tematica;
	int Aforo;
	
	public Eventos() {
	}

	public Eventos(String localizacion, int hora, String tematica, int aforo) {
		Localizacion = localizacion;
		Hora = hora;
		Tematica = tematica;
		Aforo = aforo;
	}

	/**
	 * @return the localizacion
	 */
	public String getLocalizacion() {
		return Localizacion;
	}

	/**
	 * @param localizacion the localizacion to set
	 */
	public void setLocalizacion(String localizacion) {
		Localizacion = localizacion;
	}

	/**
	 * @return the hora
	 */
	public int getHora() {
		return Hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(int hora) {
		Hora = hora;
	}

	/**
	 * @return the tematica
	 */
	public String getTematica() {
		return Tematica;
	}

	/**
	 * @param tematica the tematica to set
	 */
	public void setTematica(String tematica) {
		Tematica = tematica;
	}

	/**
	 * @return the aforo
	 */
	public int getAforo() {
		return Aforo;
	}

	/**
	 * @param aforo the aforo to set
	 */
	public void setAforo(int aforo) {
		Aforo = aforo;
	}
	
	public void CrearEvento() {
		System.out.println("Evento creado " + Tematica);
	}
	
	public void ActualizarEvento() {
		this.Tematica = getTematica();
		System.out.println("Evento actualizado " + Tematica);
	}
	
	public void EliminarEvento() {
		System.out.println("Eliminar evento " + Tematica);
	}
	
}
