package com.askeat.askandeat.models;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Hosteleros {

	@Id
	private int idHostelero;

	private String usuario;
	private String contrasena;
	private String correo;
	private String telefono;
	private boolean admin;

	public Hosteleros(String usuario, String contraseña, String correo, String telefono, boolean admin){
		super();
		this.usuario = usuario;
		this.contrasena = contraseña;
		this.correo = correo;
		this.telefono = telefono;
		this.admin = admin;
	}

	public Hosteleros(){
		super();
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

}

