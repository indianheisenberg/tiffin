package com.agrawal.tiffin.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agrawal.tiffin.models.User;

public interface UserRepo extends MongoRepository<User, String>{

}
