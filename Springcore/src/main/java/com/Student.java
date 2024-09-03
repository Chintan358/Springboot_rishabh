package com;

import java.awt.Label;
import java.util.List;
import java.util.Set;

public class Student {

	int id;
	String name;
	String email;
	String age;
	List<String> subjects;
	Set<String> languages;
	//List<Address> adr1;
	Address adr;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	
public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	//	public List<Address> getAdr() {
//		return adr1;
//	}
//	public void setAdr(List<Address> adr) {
//		this.adr1 = adr;
//	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	
	public Set<String> getLanguages() {
		return languages;
	}
	public void setLanguages(Set<String> languages) {
		this.languages = languages;
	}
	public void display()
	{
		System.out.println(id+" "+name+" "+email+" "+age);
		for(String s : subjects)
		{
			System.out.println(s);
		}
		
		for(String s :languages)
		{
			System.out.println(s);
		}
		
//		for(Address a : adr1)
//		{
//			a.display();
//		}
//		
		adr.display();
	}
	
}
