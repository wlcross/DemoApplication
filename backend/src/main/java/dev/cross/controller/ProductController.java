package dev.cross.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.cross.model.Product;
import dev.cross.service.ProductService;

@CrossOrigin
@RestController
public class ProductController {

	private final ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	
	@RequestMapping(value = "/request/{id}", method = RequestMethod.GET)
	public ResponseEntity<Product> getProduct(@PathVariable("id") int id) {
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
	}
	
	@RequestMapping(value = "/request", method = RequestMethod.GET)
	public ResponseEntity<List<Product>> getAllProducts() {
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
	}
	
	@RequestMapping(value = "/request", method = RequestMethod.POST)
	public ResponseEntity<Product> createProduct() {
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
	}
}
