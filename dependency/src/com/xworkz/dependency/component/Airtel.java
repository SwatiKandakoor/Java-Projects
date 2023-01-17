package com.xworkz.dependency.component;

import org.springframework.stereotype.Component;

import com.xworkz.dependency.rule.Provider;
@Component
public class Airtel implements Provider {

	@Override
	public void connect() {
		System.out.println("created connect method");

	}

}
