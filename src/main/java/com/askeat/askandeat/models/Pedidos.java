package com.askeat.askandeat.models;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Pedidos {

	//atributos
	@Id
	private int idPedido;

	@ManyToOne
	@JoinColumn(name="Locales")
	private int idLocal;

	@ManyToOne
	@JoinColumn(name="Clientes")
	private int idCliente;

	private Date fechaEntregaPrevista;
	private Date fechaEntrega;
	private Date fechaPedidoRealizado;
	private String destino;
	private float precioTotal;
	private boolean realizado;
	private String nota;

	//getters
	public int getIdPedido() {return idPedido;}
	public int getIdLocal() {return idLocal;}
	public int getIdCliente() {return idCliente;}
	public Date getFechaEntregaPrevista() {return fechaEntregaPrevista;}
	public Date getFechaEntrega() {return fechaEntrega;}
	public Date getFechaPedidoRealizado() {return fechaPedidoRealizado;}
	public String getDestino() {return destino;}
	public float getPrecioTotal() {return precioTotal;}
	public boolean isRealizado() {return realizado;}
	public String getNota() {return nota;}

	//setters
	public void setIdPedido(int idPedido) {this.idPedido = idPedido;}
	public void setIdLocal(int idLocal) {this.idLocal = idLocal;}
	public void setIdCliente(int idCliente) {this.idCliente = idCliente;}
	public void setFechaEntregaPrevista(Date fechaEntregaPrevista) {this.fechaEntregaPrevista = fechaEntregaPrevista;}
	public void setFechaEntrega(Date fechaEntrega) {this.fechaEntrega = fechaEntrega;}
	public void setFechaPedidoRealizado(Date fechaPedidoRealizado) {this.fechaPedidoRealizado = fechaPedidoRealizado;}
	public void setDestino(String destino) {this.destino = destino;}
	public void setPrecioTotal(float precioTotal) {this.precioTotal = precioTotal;}
	public void setRealizado(boolean realizado) {this.realizado = realizado;}
	public void setNota(String nota) {this.nota = nota;}

	//constructores
	public Pedidos(){

	}

	public Pedidos(int idPedido, int idLocal, int idCliente, Date fechaEntregaPrevista, Date fechaEntrega, Date fechaPedidoRealizado,
			String destino, float precioTotal, boolean realizado, String nota) {
		this.idPedido = idPedido;
		this.idLocal = idLocal;
		this.idCliente = idCliente;
		this.fechaEntregaPrevista = fechaEntregaPrevista;
		this.fechaEntrega = fechaEntrega;
		this.fechaPedidoRealizado = fechaPedidoRealizado;
		this.destino = destino;
		this.precioTotal = precioTotal;
		this.realizado = realizado;
		this.nota = nota;
	}






}
