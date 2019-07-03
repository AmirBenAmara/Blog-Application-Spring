package com.example.demo.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity //creer la table user avec ses colones 
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ; 
	private String username ; 
	private String password ; 
	private String email ; 
	
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER , cascade = CascadeType.ALL )
	private List<Post> postList = new ArrayList<Post>();

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public List<Post> getPostList() {
		return postList;
	}

	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}
	
	public void setPostListAddOne(Post p ) {
		this.postList.add(p);
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", birthDate=" + birthDate + ", postList=" + postList + "]";
	}
	
	
	
	
	
	

}
