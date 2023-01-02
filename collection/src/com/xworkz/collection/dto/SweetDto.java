package com.xworkz.collection.dto;

public class SweetDto {
	private String name;
	private Double price;
	private boolean testGood;

	public SweetDto() {
		// TODO Auto-generated constructor stub
	}

	
	public SweetDto(String name, Double price, boolean testGood) {
		super();
		this.name = name;
		this.price = price;
		this.testGood = testGood;
	}
	@Override

	public int hashCode() {
		System.out.println("running hashcode");
		return 40;
	}

	

	@Override
	public String toString() {
		return "SweetDto [name=" + name + ", price=" + price + ", testGood=" + testGood + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean isTestGood() {
		return testGood;
	}

	public void setTestGood(boolean testGood) {
		this.testGood = testGood;
	}

}
