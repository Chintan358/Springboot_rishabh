package com.service;

import java.util.List;

import com.model.User;

public interface UserService {
	
	public void addorUpdateUser(User u);
	public List<User> viewAllUser();
	public User userById(int id);
	public void deleteUser(int id);
}
