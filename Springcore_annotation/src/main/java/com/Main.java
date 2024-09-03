package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Account sa = context.getBean("saving",Account.class);
		sa.getBalance();
		
//		Account ca = context.getBean("currentAccount",Account.class);
//		ca.getBalance();
		
		
	}
}
