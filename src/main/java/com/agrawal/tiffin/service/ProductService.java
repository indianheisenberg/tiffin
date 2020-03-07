package com.agrawal.tiffin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrawal.tiffin.models.Product;
import com.agrawal.tiffin.repo.ProductRepo;

@Service
public class ProductService {

	
	@Autowired
	private ProductRepo productRepo;
	
	public List<Product> getProducts(){
		
		return productRepo.findAll();
	}
	
	
	public Product saveProduct(Product product){
		
		return productRepo.save(product);
	}
}
