package com.agrawal.tiffin.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agrawal.tiffin.models.Product;

public interface ProductRepo extends MongoRepository<Product, String>{

}
