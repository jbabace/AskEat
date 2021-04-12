package com.askeat.askandeat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.askeat.askandeat.models.Clientes;
import com.askeat.askandeat.repository.PedidosRepository;

@RequestMapping("/pedidos")
@RestController
public class PedidosController extends WebMvcConfigurationSupport{

	@Autowired
	private PedidosRepository pedidosRepository;

	/*@GetMapping("/leer")
	public List<Clientes> leerPedidos() {
		return pedidosRepository.findAll();
	}*/

}
