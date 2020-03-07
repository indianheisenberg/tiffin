package com.agrawal.tiffin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agrawal.tiffin.models.Product;
import com.agrawal.tiffin.models.User;
import com.agrawal.tiffin.service.ProductService;
import com.agrawal.tiffin.service.UserService;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductService productService;

    @GetMapping("/getHello")
    public String getHello(){
        return "ok";
    }
    
    
    @PostMapping(value="/saveUser",produces = MediaType.APPLICATION_JSON_VALUE)
    public User saveUser(@RequestBody User user){
    	
    	return userService.saveUser(user);
    	
    }
    
    @PostMapping(value="/saveProduct",produces = MediaType.APPLICATION_JSON_VALUE)
    public Product saveProduct(@RequestBody Product product){
    	
    	
    	return productService.saveProduct(product);
    	
    }
    
    @GetMapping(value="/getProducts",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProducts(){
    	
    	return productService.getProducts();
    }
}
