package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}

	@GetMapping("/about")
	public String about() {
		return "about";
	}

	@GetMapping("/pricing")
	public String pricing() {
		return "pricing";
	}

	@GetMapping("/car")
	public String car() {
		return "car";
	}

	@GetMapping("/car-single")
	public String car_single() {
		return "car-single";
	}

	@GetMapping("/login")
	public String loginpage()
	{
		return "login";
	}
	
	@GetMapping("/reg")
	public String regpage()
	{
		return "reg";
	}
}
