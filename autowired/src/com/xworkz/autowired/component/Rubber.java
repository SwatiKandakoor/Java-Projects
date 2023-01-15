package com.xworkz.autowired.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	@Autowired
	@Qualifier("rubberName")
	private String name;
	@Autowired
	@Qualifier("rubberType")
	private String type;
	@Autowired
	@Qualifier("rubberprice")
	private double price;
	@Autowired
	@Qualifier("rubberColor")
	private String color;
	@Autowired
	@Qualifier("rubbershape")
	private String shape;
	@Autowired
    @Qualifier("rubberStolen")
	private boolean stolen;
	@Autowired
	private int size;

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}

}
