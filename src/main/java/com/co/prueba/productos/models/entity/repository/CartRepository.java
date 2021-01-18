package com.co.prueba.productos.models.entity.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.co.prueba.productos.models.entity.Cart;

@Repository
public class CartRepository {

	@Autowired
	EntityManagerFactory emf;

	public Cart cartExist(Long idProduct) {

		Cart cart = new Cart();

		EntityManager em = emf.createEntityManager();

		Query q = em.createNativeQuery("SELECT id, id_product, quantity, value " + "FROM cart "
				+ "WHERE id_product = "+idProduct+"");

		List<Object[]> c = q.getResultList();

		for (Object[] a : c) {
			cart.setId(Long.parseLong(a[0].toString()));
			cart.setId_product(Long.parseLong(a[1].toString()));
			cart.setQuantity(Integer.parseInt(a[2].toString()));
			cart.setValue(Double.parseDouble(a[3].toString()));
		}

		return cart;

	}
	
	
}
