package com.askeat.askandeat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.web.bind.annotation.*;


import com.askeat.askandeat.models.Productos;
import com.askeat.askandeat.repository.ProductosRepository;

public class ProductosController {

	@Autowired
	private Repository repositorio;
	@Autowired
	private ProductosRepository Productorepository;
	/*@Autowired
	private AskEat AskEat;*/

	@GetMapping(path="/getProductos")
	public @ResponseBody Iterable<Productos> getProductos(){
		return Productorepository.findAll();
	}

	@GetMapping(path="/getProducto")
	public @ResponseBody Productos getProducto(@RequestParam int id){
		return Productorepository.findById(id);
	}


	@RequestMapping(path="/nuevoProducto")
	public @ResponseBody Productos nuevoProducto(@RequestParam String nombre,@RequestParam String tipo,@RequestParam String tipoDieta){
		Productos p = new Productos();
		p.setNombre(nombre);
		p.setTipo(tipo);
		p.setTipoDieta(tipoDieta);

		Productorepository.save(p);
		return p;
	}

	@RequestMapping(path="/updateProducto")
	public @ResponseBody Productos updateProducto(@RequestParam int id, String nombre, String tipo, String tipoDieta){
		Productos p = Productorepository.findById(id);

		if(nombre == null){
			nombre = p.getNombre();
		}

		if(tipo == null){
			tipo = p.getTipo();
		}

		if(tipoDieta == null){
			tipoDieta = p.getTipoDieta();
		}

		p.setNombre(nombre);
		p.setTipo(tipo);
		p.setTipoDieta(tipoDieta);

		Productorepository.save(p);
		return p;
	}

	@RequestMapping(path="/deleteProducto")
	public @ResponseBody Productos deleteProducto(@RequestParam int id){
		Productos p = Productorepository.findById(id);

		Productorepository.deleteById(id);
		return p;
	}
}
