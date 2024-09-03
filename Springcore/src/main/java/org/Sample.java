package org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample {
	public static void main(String[] args) {
		
		
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext2.xml");
		
		Employee e = (Employee) context.getBean("emp");
		e.display();
	}
}
