package com.brilliant.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.brilliant.config.ProductConfig;
import com.brilliant.model.Product;
import com.brilliant.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProduct(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/products/{Id}")
	public Optional<Product> getAllProduct(@PathVariable Integer Id){
		return productService.getProductById(Id);
	}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
//		System.out.println(product.getpDescription());
//		System.out.println(product.getpId());
//		System.out.println(product.getpName());
	}
	
	@PutMapping("/products/{Id}")
	public void updateProduct( @PathVariable Integer Id, @RequestBody Product product) {
		productService.updateProduct(Id,product);
	}
	
	@DeleteMapping("/products/{Id}")
	public void deleteProductById(@PathVariable Integer Id) {
		productService.deleteById(Id);
	}

}
