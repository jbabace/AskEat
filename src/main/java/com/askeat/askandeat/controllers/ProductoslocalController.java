package com.askeat.askandeat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.askeat.askandeat.models.Productolocal;
import com.askeat.askandeat.repository.PorductoslocalRepository;

public class ProductoslocalController {

	@Autowired
	private Repository repositorio;
	@Autowired
	private PorductoslocalRepository PorductoslocalRepository;


	@GetMapping(path="/getProducto")
	public @ResponseBody List<Productolocal> getProducto(@RequestParam int idLocal){
		return PorductoslocalRepository.findByIdLocal(idLocal);
	}


	@RequestMapping(path="/nuevoProducto")
	public @ResponseBody Productolocal nuevoProducto(@RequestParam int idLocal,@RequestParam int idProducto,@RequestParam Float precio){
		Productolocal pl = new Productolocal();
		pl.setIdLocal(idLocal);
		pl.setIdProducto(idProducto);
		pl.setPrecio(precio);

		PorductoslocalRepository.save(pl);
		return pl;
	}

	@RequestMapping(path="/updateProductolocalPrecio")
	public @ResponseBody Productolocal updateProductolocalPrecio(@RequestParam int idLocal,@RequestParam int idProducto, @RequestParam float precio, boolean existe){
		Productolocal p = PorductoslocalRepository.findByIdProducto(idProducto);
		p.setPrecio(precio);
		PorductoslocalRepository.save(p);
		return p;
	}

	@RequestMapping(path="/updateProductolocalExiste")
	public @ResponseBody Productolocal updateProductolocalExiste(@RequestParam int idLocal,@RequestParam int idProducto){
		Productolocal p = PorductoslocalRepository.findByIdProducto(idProducto);
		p.setExiste();
		PorductoslocalRepository.save(p);
		return p;
	}

	@RequestMapping(path="/deleteProducto")
	public @ResponseBody Productolocal deleteProducto(@RequestParam int idLocal,@RequestParam int idProducto){
		Productolocal p = PorductoslocalRepository.findByIdProducto(idLocal);

		PorductoslocalRepository.deleteById(idLocal);
		return p;
	}
}


