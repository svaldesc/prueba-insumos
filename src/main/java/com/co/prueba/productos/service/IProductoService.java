package com.co.prueba.productos.service;

import java.util.List;

import com.co.prueba.productos.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
}
