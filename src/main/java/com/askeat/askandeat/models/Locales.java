package com.askeat.askandeat.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Locales {

	@Id
	private int idLocal;

	private String nombre;
	private String direccion;
	private String especialidad;
	private boolean domicilio;

	// foreign key a hosteleros
	private int idHostelero;

	public Locales(String nombre, String direccion, String especialidad, boolean domicilio, int idHostelero){
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.especialidad = especialidad;
		this.domicilio = domicilio;
	}

	public Locales(){
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public boolean isDomicilio() {
		return domicilio;
	}

	public void setDomicilio(boolean domicilio) {
		this.domicilio = domicilio;
	}

	public int getIdHostelero() {
		return idHostelero;
	}

	public void setIdHostelero(int idHostelero) {
		this.idHostelero = idHostelero;
	}


}
