package com.xworkz.customdata.component;

import org.springframework.stereotype.Component;

@Component
public class Director {
	private Experience experience;

	public Director() {
		System.out.println("craeted director no-arg cons..");
	}

}
