package com.example.demo.serices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Post;
import com.example.demo.repositories.PostRepository;

@Service("postservice")
public class PostServiceImpl implements PostService{

	@Autowired
	PostRepository postrepository ; 
	

	@Override
	public void AjoutPost(Post post) {
		postrepository.save(post);
		
	}

}
