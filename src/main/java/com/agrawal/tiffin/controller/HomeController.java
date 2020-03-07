package com.agrawal.tiffin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agrawal.tiffin.models.User;
import com.agrawal.tiffin.service.UserService;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private UserService userService;

    @GetMapping("/getHello")
    public String getHello(){
        return "ok";
    }
    
    
    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user){
    	
    	return userService.saveUser(user);
    	
    }
}
