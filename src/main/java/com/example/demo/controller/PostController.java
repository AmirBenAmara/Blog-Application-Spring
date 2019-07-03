package com.example.demo.controller;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Post;
import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.serices.PostService;
import com.example.demo.serices.UserServices;

@RestController
@RequestMapping("/post")
public class PostController {
	
	
	@Autowired
	PostService postservice;

	@Autowired
	UserServices userservice;
	
	
    @RequestMapping(value = "/add/{userid}", method = RequestMethod.POST)
	public void savePost(@RequestBody Post post , @PathVariable("userid") Integer id  ) {
		
    	User u = userservice.getUserById(id);
    	
    	Post p1 = new Post();
    	p1.setText("textjava");
    	
    	
    	//meth : cascadeType.PERSIST , em.persist() instead of repo.save() 
    	u.setPostListAddOne(p1);;//affecter post -> user : master->slave
    	userservice.AjouterUser(u); //
    	
    	post.setUser(u);//affecter user -> post : slave -> master
    	postservice.AjoutPost(post);

    	
    }
    
    /*@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<User> getAll() {
		return postservice.getAll();	
		
	}*/


}
