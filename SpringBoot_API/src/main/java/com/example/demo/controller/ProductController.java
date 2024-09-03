package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/")
	public ResponseEntity products()
	{
		List<Product> products = productService.viewAllProducts();
		return new ResponseEntity(products,HttpStatus.OK);
	}
}
