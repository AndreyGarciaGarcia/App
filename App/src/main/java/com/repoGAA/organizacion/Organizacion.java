package com.repoGAA.organizacion;

public class Organizacion {

	String nombre;
	int NumeroPersonas;
	String Correo;
	int Telefono;
	
	public Organizacion() {
	}
	public Organizacion(String nombre, int numeroPersonas, String correo, int telefono) {
		this.nombre = nombre;
		NumeroPersonas = numeroPersonas;
		Correo = correo;
		Telefono = telefono;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the numeroPersonas
	 */
	public int getNumeroPersonas() {
		return NumeroPersonas;
	}
	/**
	 * @param numeroPersonas the numeroPersonas to set
	 */
	public void setNumeroPersonas(int numeroPersonas) {
		NumeroPersonas = numeroPersonas;
	}
	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return Correo;
	}
	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		Correo = correo;
	}
	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return Telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre de la organizacion: " + nombre);
		System.out.println("Numero de personas: " + NumeroPersonas);
		System.out.println("Correo: " + Correo);
		System.out.println("Numero de telefono: " + Telefono);

	}
	
}
