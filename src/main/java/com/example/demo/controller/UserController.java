package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.serices.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userrepository;
	
	@Autowired
	UserServices userservices;
	
	
	
    @RequestMapping(value = "/add", method = RequestMethod.POST)
	public void saveUser(@RequestBody User user) {
		userrepository.save(user);	
		
	}
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<User> getAll() {
		return userservices.getAll();	
		
	}
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
   	public void deleteUser(@PathVariable("id") Integer id ) {
    	
    	User u = userservices.getUserById(id);
    	userservices.DeleteUser(u);
    	
    	//userservices.DeleteUser(userservices.getUserById(id));
   		
   	}


}
