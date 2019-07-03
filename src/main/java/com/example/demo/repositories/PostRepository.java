package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Post;

@Repository("PostRepository")
public interface PostRepository extends JpaRepository<Post, Integer>{

}
