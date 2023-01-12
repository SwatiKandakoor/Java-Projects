package com.xworkz.autowired.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	@Autowired
	@Qualifier("softwareEngineerName")
	private String name;
	@Autowired
	private double salary;
	@Autowired
	@Qualifier("softwareEngineerCompanyName")
	private  String companyName;
	@Autowired
	@Qualifier("softwareEngineerExperience")
	private int experience;
	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salary=" + salary + ", companyName=" + companyName
				+ ", experience=" + experience + "]";
	}
	

}
