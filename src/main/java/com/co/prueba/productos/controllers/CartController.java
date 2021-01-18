package com.co.prueba.productos.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.prueba.productos.models.entity.Cart;
import com.co.prueba.productos.service.ICartService;

@RestController
@CrossOrigin
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private ICartService cartService;
	
	@PostMapping("/add")
	public Cart add(@RequestBody Cart cart){
		return cartService.save(cart);
	}	

}
