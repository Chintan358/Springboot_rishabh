package com;

import org.springframework.stereotype.Component;

@Component
public class CurrentAccount implements Account {

	@Override
	public void getBalance() {
		System.out.println("current Acoount calling...");
	}

}
