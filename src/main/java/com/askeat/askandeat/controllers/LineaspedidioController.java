package com.askeat.askandeat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.askeat.askandeat.models.Lineaspedido;
import com.askeat.askandeat.models.Productos;
import com.askeat.askandeat.repository.LineaspedidoRepository;
import com.askeat.askandeat.repository.ProductosRepository;

public class LineaspedidioController {
	@Autowired
	private Repository repositorio;
	@Autowired
	private LineaspedidoRepository LineaspedidoRepository;

	@GetMapping(path="/getLineaspedido")
	public @ResponseBody List<Lineaspedido> LineaspedidoRepository(){
		return LineaspedidoRepository.findAll();
	}

	@GetMapping(path="/getLineaspedidoByPedido")
	public @ResponseBody List<Lineaspedido> getLineaspedidoByPedido(@RequestParam int id){
		return LineaspedidoRepository.findByIdPedido(id);
	}


	@RequestMapping(path="/nuevoProducto")
	public @ResponseBody Lineaspedido nuevoProducto(@RequestParam int idPedido,@RequestParam int cantidad,@RequestParam Float precioLinea){
		Lineaspedido Lp = new Lineaspedido();
		Lp.setIdPedido(idPedido);
		Lp.setCantidad(cantidad);
		Lp.setPrecioLinea(precioLinea);


		LineaspedidoRepository.save(Lp);
		return Lp;
	}

}
