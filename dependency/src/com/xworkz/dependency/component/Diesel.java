package com.xworkz.dependency.component;

import org.springframework.stereotype.Component;

import com.xworkz.dependency.rule.Fuel;
@Component
public class Diesel implements Fuel{

	@Override
	public boolean consume() {
		System.out.println("created consume method");
		return false;
	}

	
}
