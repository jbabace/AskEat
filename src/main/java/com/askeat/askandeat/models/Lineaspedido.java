package com.askeat.askandeat.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lineaspedido {

	@Id
	private int idProducto;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idLinea;
	private int cantidad;
	private float precioLinea;

	private int idPedido;

	public Lineaspedido(int idProducto, int idLinea, int idPedido, int cantidad, float precioLinea) {
		super();
		this.idProducto = idProducto;
		this.idLinea = idLinea;
		this.idPedido = idPedido;
		this.cantidad = cantidad;
		this.precioLinea = precioLinea;
	}

	public Lineaspedido() {}

	public int getIdProducto() {
		return idProducto;
	}
	public int getIdLinea() {
		return idLinea;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public int getCantidad() {
		return cantidad;
	}
	public float getPrecioLinea() {
		return precioLinea;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public void setIdLinea(int idLinea) {
		this.idLinea = idLinea;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public void setPrecioLinea(float precioLinea) {
		this.precioLinea = precioLinea;
	}



}
