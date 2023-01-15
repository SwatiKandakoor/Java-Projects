package com.xworkz.customdata.component;

import org.springframework.stereotype.Component;

@Component
public class Battery {
	private Capacity capacity;

	public Battery() {
		System.out.println("craeted battery no-arg cons..");
	}

}
