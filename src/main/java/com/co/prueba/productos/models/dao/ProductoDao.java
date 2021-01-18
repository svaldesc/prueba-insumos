package com.co.prueba.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.co.prueba.productos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
