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
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ResponseEntity<List<Product>> getProducts() {
		List<Product> product = productService.getProducts();
		
		if (product == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(product);
		} else if (product.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(product);
		} 

		return ResponseEntity.status(HttpStatus.OK).body(product);
		
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public ResponseEntity<Product> createProduct(@RequestBody Product p) {
		Product newP = productService.createProduct(p);
		if (newP == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(newP);
		}
		
		
		
	}
}
