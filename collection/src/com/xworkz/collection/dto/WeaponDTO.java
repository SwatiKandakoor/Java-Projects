package com.xworkz.collection.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class WeaponDTO implements Serializable,Comparable<WeaponDTO> {
	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private Double price;
	private Type type;

	public WeaponDTO() {
		// TODO Auto-generated constructor stub
	}

	public WeaponDTO(String name, String madeBy, LocalDate madeOn, Double price, Type type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + "]";
	}

//	@Override
//	public int compareTo(WeaponDTO o) {
//		return this.madeOn.compareTo(o.madeOn);
//	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public int compareTo(WeaponDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
