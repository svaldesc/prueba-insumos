package com.co.prueba.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.co.prueba.productos.models.entity.Cart;

public interface CartDao extends CrudRepository<Cart, Long> {

}
