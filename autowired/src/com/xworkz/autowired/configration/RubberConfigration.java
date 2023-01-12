package com.xworkz.autowired.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ComponentScan("com.xworkz.autowired")
public class RubberConfigration {
	public RubberConfigration() {
		System.out.println("created hardwar shop no-arg cons...");
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
		public double rubberPrice() {
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
		public String shape() {
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
		@Bean 
		public String eName() {
			System.out.println("created employee name bean...");
			String ref=new String("Sunitha");
			return ref;
		}
		@Bean 
		public int eAge() {
			System.out.println("created employee age bean...");
			int ref =23;
			return ref;
		}
		@Bean 
		public int eIdNo() {
			System.out.println("created employee id no bean...");
			int ref =23045;
			return ref;
		}
		@Bean 
		public double ePrice() {
			System.out.println("created employee price bean...");
			double ref =23000;
			return ref;
		}
		@Bean 
		public int experience() {
			System.out.println("created employee experience bean...");
			int ref =2;
			return ref;
		}
		@Bean 
		public boolean eTestingRole() {
			System.out.println("created employee testing role bean...");
			return false;
		}
		@Bean 
		public boolean goodEmployee() {
			System.out.println("created employee good employee role bean...");
			return true;
		}
		@Bean 
		public double eCompanyArea() {
			System.out.println("created employee name bean...");
			double ref=6754;
			return ref;
		}
		@Bean 
		public double phoneNo() {
			System.out.println("created employee name bean...");
			double ref=807398248;
			return ref;
		}


	}


