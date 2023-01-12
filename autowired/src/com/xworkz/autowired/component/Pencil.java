package com.xworkz.autowired.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired
	@Qualifier("pencilName")
	private String name;
	@Autowired
	private String type;
	@Autowired
	private double price;
	@Autowired
	@Qualifier("pencilColor")
	private String color;
	@Autowired
	@Qualifier("pencilSharp")
	private boolean sharp;
	@Autowired

	private boolean stole;

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stole=" + stole + "]";
	}

}
