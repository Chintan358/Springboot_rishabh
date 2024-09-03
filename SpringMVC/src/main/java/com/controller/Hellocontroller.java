package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.User;

@Controller
public class Hellocontroller {

	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		User user = new User();
		model.addAttribute("user", user);
		return "home";
	}
	
	@RequestMapping(value = "/addUser",method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User u)
	{
		System.out.println(u.getName()+" "+u.getEmail());
		return "redirect:home";
	}
	
	
}
