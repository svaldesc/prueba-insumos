package com.co.prueba.productos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.prueba.productos.models.dao.CartDao;
import com.co.prueba.productos.models.entity.Cart;
import com.co.prueba.productos.models.entity.repository.CartRepository;


@Service
public class CartServiceImpl implements ICartService {

	@Autowired
	private CartDao cartDao;
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart save(Cart cart) {
		Cart cartExist = cartRepository.cartExist(cart.getId_product());
		if(cartExist.getId() == 0) {
			cartExist = cart;
		} else {
			int quantity = cartExist.getQuantity() + 1;
			cartExist.setQuantity(quantity);
			cartExist.setValue(cart.getValue() * quantity);
		}
		
		return cartDao.save(cartExist);
	}
	
	


}
