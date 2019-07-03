package com.example.demo.serices;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service("userservices")
public class UserServiceImpl implements UserServices{

	@Autowired
	UserRepository userrepository;
	
	@PersistenceContext
	EntityManager em ;
	
	@Override
	public List<User> getAll() {
		
		return userrepository.findAll();
	}

	@Override
	public User getUserById(Integer id) {
		return userrepository.getOne(id);
	}

	@Transactional
	@Override
	public void AjouterUser(User user) {
		em.persist(user);
		
	}

	@Override
	public void DeleteUser(User user) {
		userrepository.delete(user);
		
	}

	

	

}
