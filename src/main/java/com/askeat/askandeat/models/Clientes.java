package com.askeat.askandeat.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clientes {

	//atributos
	@Id
	private int idCliente;

	private String usuario;
	private String contrasena;
	private String correo;
	private String telefono;
	private String direccion;
	private String gustos;
	private String dieta;

	//getters
	public int getIdCliente() {return idCliente;}
	public String getUsuario() {return usuario;}
	public String getContrasena() {return contrasena;}
	public String getCorreo() {return correo;}
	public String getTelefono() {return telefono;}
	public String getDireccion() {return direccion;}
	public String getGustos() {return gustos;}
	public String getDieta() {return dieta;}

	//setters
	public void setIdCliente(int idCliente) {this.idCliente = idCliente;}
	public void setUsuario(String usuario) {this.usuario = usuario;}
	public void setContrasena(String contrasena) {this.contrasena = contrasena;}
	public void setCorreo(String correo) {this.correo = correo;}
	public void setTelefono(String telefono) {this.telefono = telefono;}
	public void setDireccion(String direccion) {this.direccion = direccion;}
	public void setGustos(String gustos) {this.gustos = gustos;}
	public void setDieta(String dieta) {this.dieta = dieta;}

	//constructores
	public Clientes(){

	}

	public Clientes(int idCliente, String usuario, String contrasena, String correo, String telefono, String direccion,
			String gustos, String dieta) {
		this.idCliente = idCliente;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.correo = correo;
		this.telefono = telefono;
		this.direccion = direccion;
		this.gustos = gustos;
		this.dieta = dieta;
	}


}
