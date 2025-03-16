package com.repoGAA.usuarios;

import com.repoGAA.evento.Eventos;

public class Usuarios {
	
	String NombreUsuario;
	String DNI;
	String Correo;
	int Telefono;
	
	public Usuarios() {
	}

	public Usuarios(String nombreUsuario, String dNI, String correo, int telefono) {
		NombreUsuario = nombreUsuario;
		DNI = dNI;
		Correo = correo;
		Telefono = telefono;
	}

	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return NombreUsuario;
	}

	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}

	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
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
	
	public void BuscarEvento(String Tematica) {
		System.out.println(NombreUsuario + " esta buscando eventos de " + Tematica);
		
	}
	
	public void CrearUsuario() {
		System.out.println("Usuario creado: " + NombreUsuario);
	}
	
	public void RegistrarUsuario() {
		System.out.println("Usuario registrado: " + NombreUsuario);
	}
	
	public void AsistireEvento(Eventos evento) {
		System.out.println(NombreUsuario + "asistira al evento " + evento.getTematica());
	}
	
	public void EliminarUsuario() {
		System.out.println("Usuario eliminado " + NombreUsuario);
	}
}
