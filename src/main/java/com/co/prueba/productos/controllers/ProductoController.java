package com.co.prueba.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.prueba.productos.models.entity.Producto;
import com.co.prueba.productos.service.IProductoService;

@RestController
@CrossOrigin
@RequestMapping("/insumos")
public class ProductoController {

	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
	return productoService.findAll();
	}	
	
	
}
