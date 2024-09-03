package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo repo;
	
	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		
	}

}
