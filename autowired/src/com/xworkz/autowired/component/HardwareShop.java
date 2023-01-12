package com.xworkz.autowired.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	public HardwareShop() {
		System.out.println("created hardwar shop no-arg cons...");
	}

	@Autowired
	@Qualifier("id")
	private int id;
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	private int gstNo;
	@Autowired
	@Qualifier("owName")
	private String ownerName;
	@Autowired
	@Qualifier("newAddress")
	private String address;

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}

}
