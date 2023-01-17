package com.xworkz.dependency.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.xworkz.dependency.rule.Fuel;

public class Petrol implements Fuel {
	@Autowired
	@Qualifier("diesel")
	private Fuel fuel;

	@Override
	public boolean consume() {
		System.out.println("created consume method");
		return false;
	}
}