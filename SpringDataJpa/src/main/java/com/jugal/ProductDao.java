package com.jugal;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.omg.CORBA.portable.RemarshalException;
import org.springframework.stereotype.Component;

@Component
public class ProductDao {

	@PersistenceContext
	private EntityManager em;

	public void persist(Product product) {
		em.persist(product);
	}

	public List<Product> findAll() {
		return em.createQuery("SELECT p FROM Product p").getResultList();
	}

	public void deleteAll() {
		em.createQuery("Delete from Product").executeUpdate();
	}
}
