package com.xworkz.autowiredex.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired
	private int id;
	private String name;
	private String ownerName;
	@Autowired
	@Qualifier("nlang")
	private String lang;
	@Autowired
	private double price;

	@Autowired
	public NewsPaper(@Qualifier("nname") String name, @Qualifier("nownerName") String ownerName) {
		this.name = name;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", lang=" + lang + ", price="
				+ price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
