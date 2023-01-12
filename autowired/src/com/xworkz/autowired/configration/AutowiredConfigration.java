package com.xworkz.autowired.configration;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autowired")
public class AutowiredConfigration {
	@Bean
	public int id() {
		System.out.println("created id bean..");
		int ref = 10;
		return ref;
	}

	@Bean
	public String name() {
		System.out.println("created name bean...");
		String ref = new String("Sahana");
		return ref;

	}

	@Bean
	public int gstNo() {
		System.out.println("created gstNo bean...");
		int ref = 29;
		return ref;

	}

	@Bean
	public String owName() {
		System.out.println("created owner name bean...");
		String ref = new String("Kavya");
		return ref;

	}

	@Bean
	public String newAddress() {
		System.out.println("created address bean...");
		String ref = new String("Baglkot");
		return ref;

	}

	@Bean
	public String softwareName() {
		System.out.println("created software name bean... ");
		String ref = new String("Eclipse");
		return ref;
	}

	@Bean
	public double softwareVersion() {
		System.out.println("created software version bean... ");
		double ref = 1.8;
		return ref;

	}

	@Bean
	public String softwareDeveloper() {
		System.out.println("created software developer bean... ");
		String ref = new String("Savitha");
		return ref;
	}

	@Bean
	public List softwareData() {
		System.out.println("created software data bean... ");
		List ref = new LinkedList();
		ref.add("sunitha");
		ref.add("neelu");
		ref.add("swati");
		return ref;

	}

	@Bean
	public boolean softwareFree() {
		System.out.println("created software free bean...");
		return true;
	}

	@Bean
	public String softwareEngineerName() {
		System.out.println("created Software Engineer bean...");
		String ref = new String("Bhoomi");
		return ref;
	}

	@Bean
	public double salary() {
		System.out.println("created Software Engineer Salary  bean...");
		double ref = 60000;
		return ref;

	}

	@Bean
	public String softwareEngineerCompanyName() {
		System.out.println("created Software Engineer companyName  bean...");
		String ref = new String("Lilly");
		return ref;
	}

	@Bean
	public int softwareEngineerExperience() {
		System.out.println("created Software Engineer experience  bean...");
		int ref = 2;
		return ref;
	}

	@Bean
	public String pencilName() {
		System.out.println("created hardwar shop no-arg cons...");
		String ref = new String("Apsara");
		return ref;
	}

	@Bean
	public String type() {
		System.out.println("created pencil type bean...");
		String ref = new String("Solid");
		return ref;
	}

	@Bean
	public double price() {
		System.out.println("created pencil price bean...");
		double ref = 20;
		return ref;
	}

	@Bean
	public String pencilColor() {
		System.out.println("created pencil color bean...");
		String ref = new String("Black");
		return ref;
	}

	@Bean
	public boolean pencilSharp() {
		System.out.println("created pencil name bean...");
		return true;
	}

	@Bean
	public boolean stolen() {
		System.out.println("created pencil name bean...");
		return false;
	}
	
}