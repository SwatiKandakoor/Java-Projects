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
	public String hname() {
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
	public String ename() {
		System.out.println("created employee name bean...");
		String ref = new String("Naveen");
		return ref;
	}

	@Bean
	public int eAge() {
		System.out.println("created employee age bean...");
		return 22;
	}

	@Bean
	public int eIdNo() {
		System.out.println("created employee id no bean...");
		return 2345;
	}

	@Bean
	public double ePrice() {
		System.out.println("created employee price bean...");
		return 25000;
	}

	@Bean
	public int experience() {
		System.out.println("created employee experience bean...");
		return 1;
	}

	@Bean
	public boolean eTestingRole() {
		System.out.println("created employee testing role bean...");
		return false;
	}

	@Bean
	public boolean goodEmployee() {
		System.out.println("created employee good employee bean...");
		return true;
	}

	@Bean
	public double eCompanyArea() {
		System.out.println("created employee company area bean...");
		return 36622;
	}

	@Bean
	public double phoneNo() {
		System.out.println("created employee phone no bean...");
		return 703163192d;
	}

	@Bean
	public String pencilName() {
		System.out.println("created hardwar shop no-arg cons...");
		String ref = new String("Apsara");
		return ref;
	}

	@Bean
	public String ptype() {
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
		System.out.println("created pencil sharp bean...");
		return true;
	}

	@Bean
	public boolean pstolen() {
		System.out.println("created pencil stolen bean...");
		return false;
	}

	@Bean
	public String rubberName() {
		System.out.println("created rubber name bean...");
		String ref = new String("Apsara");
		return ref;
	}

	@Bean
	public String rubberType() {
		System.out.println("created rubber type bean...");
		String ref = new String("nitrile");
		return ref;
	}

	@Bean
	public double rubberprice() {
		System.out.println("created rubber price bean...");
		double ref = 10;
		return ref;
	}

	@Bean
	public String rubberColor() {
		System.out.println("created rubber color bean...");
		String ref = new String("White");
		return ref;
	}

	@Bean
	public String rubbershape() {
		System.out.println("created rubber shape bean...");
		String ref = new String("Square");
		return ref;
	}

	@Bean
	public boolean rubberStolen() {
		System.out.println("created rubber stolen bean...");
		return false;
	}

	@Bean
	public int size() {
		System.out.println("created rubber size bean...");
		int ref = 3;
		return ref;
	}

}