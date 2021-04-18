package com.askeat.askandeat.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Productolocal {

	@Id
	private int idProducto;
	@Id
	private int idLocal;
	private float precio;
	private boolean existe;

	public Productolocal(int idProducto, int idLocal, float precio) {
		super();
		this.idProducto = idProducto;
		this.idLocal = idLocal;
		this.precio = precio;
		this.existe = true;
	}

	public Productolocal() {}

	public int getIdProducto() {
		return idProducto;
	}
	public int getIdLocal() {
		return idLocal;
	}
	public float getPrecio() {
		return precio;
	}
	public boolean isExiste() {
		return existe;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public void setIdLocal(int idLocal) {
		this.idLocal = idLocal;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public void setExiste() {
		if (this.existe){
			this.existe = false;
		}else{
			this.existe = true;
		}
	}


}
