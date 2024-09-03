package com.example.demo.model;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="cname")
	private String categoryName;
	
	
	@OneToMany(mappedBy ="category",cascade = CascadeType.ALL)
	List<Product> product;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
	
}
