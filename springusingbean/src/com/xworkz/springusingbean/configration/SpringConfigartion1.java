package com.xworkz.springusingbean.configration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springusingbean")
public class SpringConfigartion1 {
	@Bean
	public String read() {
		System.out.println("-------manage string----------------");
		System.out.println("Registering read with spring....");
		String ref = new String("swati");
		return ref;
	}

	@Bean
	public String eat() {
		System.out.println("Registering eat with spring....");
		String ref = new String("swati");
		return ref;
	}

	@Bean
	public String man() {
		System.out.println("Registering man with spring....");

		return "Sahan";
	}

	@Bean
	public String dog() {
		System.out.println("Registering dog with spring....");
		String ref = new String("rambo");
		return ref;
	}

	@Bean
	public String location() {
		System.out.println("Registering location with spring....");
		return "Ilkal";
	}

	@Bean
	public Boolean won() {
		System.out.println("-------manage Boolean----------------");
		System.out.println("Registering won with spring....");
		return true;
	}

	@Bean
	public Boolean god() {
		System.out.println("Registering god with spring....");
		return true;
	}

	@Bean
	public Boolean graduate() {
		System.out.println("Registering graduate with spring....");
		return false;
	}

	@Bean
	public Boolean unEmploye() {
		System.out.println("Registering un employe with spring....");
		return false;
	}

	@Bean
	public Boolean mock() {
		System.out.println("Registering mock with spring....");
		return true;
	}

	@Bean
	public Double price() {
		System.out.println("-------manage Double----------------");
		System.out.println("Registering price with spring.....");
		return 200d;
	}

	@Bean
	public Double salary() {
		System.out.println("Registering salary with spring.....");
		return 20000d;
	}

	@Bean
	public Double phoneNo() {
		System.out.println("Registering phoneNO with spring.....");
		return 8073982483d;
	}

	@Bean
	public Double adharNo() {
		System.out.println("Registering adharNo with spring.....");
		return 893438777d;
	}

	@Bean
	public Double year() {
		System.out.println("Registering year with spring.....");
		return 2023d;
	}

	@Bean
	public StringBuffer remove() {
		System.out.println("-------manage stringBuffer----------------");
		System.out.println("Registering remove with spring.........");
		StringBuffer ref = new StringBuffer("neelu");
		return ref;
	}

	@Bean
	public StringBuffer walk() {
		System.out.println("Registering walk with spring.........");
		StringBuffer ref = new StringBuffer("neelu");
		return ref;
	}

	@Bean
	public StringBuffer age() {
		System.out.println("Registering age with spring.........");
		StringBuffer ref = new StringBuffer(24);
		return ref;
	}

	@Bean
	public StringBuffer size() {
		System.out.println("Registering size with spring.........");
		StringBuffer ref = new StringBuffer('M');
		return ref;
	}

	@Bean
	public StringBuffer height() {
		System.out.println("Registering height with spring.........");
		StringBuffer ref = new StringBuffer(5);
		return ref;
	}

	@Bean
	public StringBuilder running() {
		System.out.println("--------manage StringBuilder---------");
		System.out.println("Registering running with spring..........");
		StringBuilder ref = new StringBuilder("fast");
		return ref;
	}

	@Bean
	public StringBuilder walking() {
		System.out.println("Registering walking with spring..........");
		StringBuilder ref = new StringBuilder("slow");
		return ref;
	}

	@Bean
	public StringBuilder eating() {
		System.out.println("Registering eating with spring..........");
		StringBuilder ref = new StringBuilder("fast");
		return ref;
	}

	@Bean
	public StringBuilder bath() {
		System.out.println("Registering bath with spring..........");
		StringBuilder ref = new StringBuilder("slow");
		return ref;
	}

	@Bean
	public StringBuilder growth() {
		System.out.println("Registering growth with spring..........");
		StringBuilder ref = new StringBuilder("increment");
		return ref;
	}

	@Bean
	public ArrayList arrays() {
		System.out.println("Registering array list with spring..........");
		ArrayList<String> array = new ArrayList<String>();
		array.add("Apple");
		array.add("banana");
		array.add("orange");
		array.add("chikku");
		array.add("pappaya");
		return array;

	}

	@Bean
	public Map map() {
		System.out.println("Registering map with spring..........");
		Map<String, Double> maping = new HashMap<String, Double>();
		maping.put("Wipro", 25000d);
		maping.put("TCS", 26000d);
		maping.put("IBM", 30000d);
		maping.put("Infosys", 26000d);
		maping.put("Capgimani", 24000d);
		Set<Entry<String, Double>> enties = maping.entrySet();

		return maping;
	}

}
