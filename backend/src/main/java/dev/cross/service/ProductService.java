package dev.cross.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.cross.model.Product;
import dev.cross.repository.ProductDAO;

@Service
public class ProductService {

	private final ProductDAO productDao;
	
	@Autowired
	public ProductService(ProductDAO productDao) {
		this.productDao = productDao;
	}
	
	public List<Product> getProducts() {
		return productDao.findAll();
	}
	
	public Product createProduct(Product p) {
		if (p != null) {
			p.setId(0);
		}
		return productDao.save(p);
	}
}
