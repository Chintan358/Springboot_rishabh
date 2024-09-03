package com.example.demo.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public ResponseEntity getUsers()
	{
		List<User> users = userService.viewUsers();
		
		
		
		List<UserDto> dto = new ArrayList<>();
		
		for(int i=0;i<users.size();i++)
		{
			UserDto dt = new UserDto();
			dt.setId(users.get(i).getId());
			dt.setName(users.get(i).getName());
			
			dto.add(dt);
		}
		
		
		
		return new ResponseEntity(dto,HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity addUsers(@RequestBody User u)
	{
		User user =  userService.addOrUpdateUser(u);
		return new ResponseEntity(user,HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity updateUser(@RequestBody User u, @PathVariable("id") int id)
	{
		u.setId(id);
		User user = userService.addOrUpdateUser(u);
		return new ResponseEntity(user,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable("id") int id)
	{
		userService.deleteUser(id);
		return "User Deleted Successfully";
		
	}
	
}
