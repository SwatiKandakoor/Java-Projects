package com.xworkz.collection.dto;

public class DaugtherDTO {
	private String name;
	private double mobile;
	private int age;
	private boolean committed;
	private boolean alive;

	public DaugtherDTO() {
		// TODO Auto-generated constructor stub
	}

	public DaugtherDTO(String name, double mobile, int age, boolean committed, boolean alive) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		this.committed = committed;
		this.alive = alive;
	}

	@Override
	public String toString() {
		return "DaugtherDTO [name=" + name + ", mobile=" + mobile + ", age=" + age + ", committed=" + committed
				+ ", alive=" + alive + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMobile() {
		return mobile;
	}

	public void setMobile(double mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCommitted() {
		return committed;
	}

	public void setCommitted(boolean committed) {
		this.committed = committed;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}
