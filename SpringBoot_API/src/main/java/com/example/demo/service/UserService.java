package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	
		public User addOrUpdateUser(User u);
		public List<User> viewUsers();
		public User userById(int uid);
		public void deleteUser(int uid);
	
}
