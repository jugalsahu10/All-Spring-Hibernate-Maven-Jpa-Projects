package com.jugal;


import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ProductService {

	@Autowired
	private ProductDao productDao;

	@Transactional
	public void add(Product product) {
		productDao.save(product);
	}
	
	@Transactional
	public void addAll(Collection<Product> products) {
			productDao.save(products);
	}

	@Transactional(readOnly = true)
	public List<Product> listAll() {
		return productDao.findAll();

	}

	@Transactional(readOnly = true)
	public void deleteAll() {
		productDao.deleteAll();
	}
}
