package com.agrawal.tiffin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrawal.tiffin.models.User;
import com.agrawal.tiffin.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	
	public User saveUser(User user){
		
		return userRepo.save(user);
	}
}
