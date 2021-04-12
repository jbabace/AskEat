package com.askeat.askandeat.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.askeat.askandeat.models.Productos;

public interface ProductosRepository extends CrudRepository<Productos, Integer>{

	public List<Productos> findAll();

	public Productos findById(int IdProducto);

	public Productos findByNombre(String nombre);

	public List<Productos> findByTipo(String tipo);

	public List<Productos> findByTipoDieta(String tipoDieta);
}
