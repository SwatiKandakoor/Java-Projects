package com.xworkz.collection.dto;

import com.xworkz.collection.constant.TYPE;

public class DataBaseVendorDTO {
	private String name;
	private String developedBy;
	private TYPE type;
	private int size;
	private double licenseCost;

	public DataBaseVendorDTO() {
		// TODO Auto-generated constructor stub
	}

	public DataBaseVendorDTO(String name, String developedBy, TYPE type, int size, double licenseCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.size = size;
		this.licenseCost = licenseCost;
	}

	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", size=" + size
				+ ", licenseCost=" + licenseCost + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(double licenseCost) {
		this.licenseCost = licenseCost;
	}

}
