package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		
		
		Student st = (Student) context.getBean("std");
		st.display();
		
		
	}
}
