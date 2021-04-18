package com.askeat.askandeat.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.askeat.askandeat.models.Productolocal;
import com.askeat.askandeat.models.Productos;

public interface PorductoslocalRepository extends CrudRepository<Productolocal, Integer>{
	public List<Productolocal> findAll();

	public Productolocal findByIdProducto(int IdProducto);

	public List<Productolocal> findByIdLocal(int IdLocal);

	public Productos findByNombre(String nombre);

	public List<Productos> findByTipo(String tipo);

	public List<Productos> findByTipoDieta(String tipoDieta);
}
