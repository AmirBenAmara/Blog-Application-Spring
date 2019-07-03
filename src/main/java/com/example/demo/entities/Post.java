package com.example.demo.entities;

import javax.jws.soap.SOAPBinding.Use;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ; 
	private String text ; 
	
	@JoinColumn(name = "iduser")
	@NotNull
	@JsonIgnore
	@ManyToOne 
	private User user ;

	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	 

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Post [id=" + id + ", text=" + text + ", user=" + user + "]";
	} 
	
	

}
