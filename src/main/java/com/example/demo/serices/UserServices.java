package com.example.demo.serices;

import java.util.List;

import com.example.demo.entities.User;


public interface UserServices {

	public List<User> getAll();
	
	public User getUserById(Integer id);
	
	public void  AjouterUser(User user);
	
	public void DeleteUser(User user );

}
