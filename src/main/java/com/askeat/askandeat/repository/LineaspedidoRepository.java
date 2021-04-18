package com.askeat.askandeat.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.askeat.askandeat.models.Lineaspedido;
import com.askeat.askandeat.models.Productos;

public interface LineaspedidoRepository extends CrudRepository<Lineaspedido, Integer>{
	public List<Lineaspedido> findAll();

	public List<Lineaspedido> findByIdPedido(int IdPedido);

}
