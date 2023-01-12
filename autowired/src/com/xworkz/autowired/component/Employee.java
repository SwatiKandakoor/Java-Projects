package com.xworkz.autowired.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("eAge")
	private int age;
	@Autowired
	@Qualifier("eIdNo")
	private int idNo;
	@Autowired
	@Qualifier("ePrice")
	private double price;
	@Autowired
	private int experience;
	@Autowired
	@Qualifier("eTestingRole")
	private boolean testingRole;
	@Autowired
	private boolean goodEmployee;
	@Autowired
	@Qualifier("eCompanyArea")
	private double companyArea;
	private double phoneNo;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", idNo=" + idNo + ", price=" + price + ", experience="
				+ experience + ", testingRole=" + testingRole + ", goodEmployee=" + goodEmployee + ", companyArea="
				+ companyArea + ", phoneNo=" + phoneNo + "]";
	}

}
