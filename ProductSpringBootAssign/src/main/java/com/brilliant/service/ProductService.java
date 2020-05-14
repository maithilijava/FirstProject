package com.brilliant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brilliant.model.Product;
import com.brilliant.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	public List<Product> getAllProducts(){
		List<Product> products=new ArrayList<Product>();
		productRepo.findAll().forEach(products::add);
		Product prod= new Product();
		//System.out.println(prod.getpDescription());
		return products;
		
		
	}
	
	public Optional<Product> getProductById(Integer id) {
		
		return productRepo.findById(id);
		
	}
	
	public void addProduct(Product product) {
		productRepo.save(product);
	}
	
	public void updateProduct(Integer id, Product product) {
		productRepo.save(product);
		
	}

	public void deleteById(Integer id) {
		productRepo.deleteById(id);
	}
}
