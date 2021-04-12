package com.askeat.askandeat.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Productos {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int idProducto;
	private String nombre;
	private String tipo;
	private String tipoDieta;

	public Productos(int idProducto, String nombre, String tipo, String tipoDieta) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.tipo = tipo;
		this.tipoDieta = tipoDieta;
	}

	public Productos() {}

	public int getIdProducto() {
		return idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public String getTipoDieta() {
		return tipoDieta;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setTipoDieta(String tipoDieta) {
		this.tipoDieta = tipoDieta;
	}

}
