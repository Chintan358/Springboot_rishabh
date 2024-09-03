package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repo;
	
	@Override
	public User addOrUpdateUser(User u) {
		
		
		return repo.save(u);

	}

	@Override
	public List<User> viewUsers() {
		
		List<User> users = repo.findAll();
		
		return users;
	}

	@Override
	public User userById(int uid) {
		
		return repo.findById(uid).orElseThrow();
	}

	@Override
	public void deleteUser(int uid) {
		
		repo.deleteById(uid);

	}

}
