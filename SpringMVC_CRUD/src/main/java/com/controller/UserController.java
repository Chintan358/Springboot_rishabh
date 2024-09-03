package com.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;
import com.service.UserService;





@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/reg")
	public String regPage(Model model)
	{
		User u = new User();
		model.addAttribute("user", u);
		model.addAttribute("data", userService.viewAllUser());
		return "UserReg";
	}
	
	
	
	@RequestMapping(value = "userreg",method = RequestMethod.POST)
	public String addUser(@Valid  @ModelAttribute("user") User user, BindingResult br)
	{
		System.out.println(user.getName());
		System.out.println("error : "+br.getErrorCount());
		if(br.hasFieldErrors())
		{
			System.out.println("error : "+br.getErrorCount());
			return "reg";
		}
		else
		{
			userService.addorUpdateUser(user);
			return "redirect:reg";
		}
		
		
	}
	
	@RequestMapping("/delete")
	public String deleteUser(@RequestParam("did") int did)
	{
		userService.deleteUser(did);
		return "redirect:reg";
	}
	
	@RequestMapping("/edit")
	public String editUserr(@RequestParam("eid") int eid,Model model) {
		
		User u = userService.userById(eid);
		model.addAttribute("user", u);
		model.addAttribute("data", userService.viewAllUser());
		return "UserReg";
		
	}
	
}
