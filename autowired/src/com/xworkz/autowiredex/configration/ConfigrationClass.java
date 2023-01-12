package com.xworkz.autowiredex.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.autowiredex.component.Ghost;

@Configuration
@ComponentScan("com.xworkz.autowiredex")
public class ConfigrationClass {
	public ConfigrationClass() {
		System.out.println("created no-arg configration class cons");
	}

	@Bean
	public int id() {
		System.out.println("created newspaper id bean...");
		return 235;
	}

	@Bean
	public String nname() {
		System.out.println("created newspaper name bean...");
		return "Prajavani";
	}

	@Bean
	public String nownerName() {
		System.out.println("created newspaper owner name bean...");
		return "Prajwal";
	}

	@Bean
	public String nlang() {
		System.out.println("created newspaper lang bean...");
		return "Kannada";
	}

	@Bean
	public double price() {
		System.out.println("created newspaper price bean...");
		return 5;
	}

	@Bean
	public String sname() {
		System.out.println("created snake name bean...");
		String ref = new String("hebba havu");
		return ref;
	}

	@Bean
	public int length() {
		System.out.println("created snake length bean...");

		return 5;
	}

	@Bean
	public String scolor() {
		System.out.println("created snake color bean...");
		String ref = new String("wheet");
		return ref;
	}

	@Bean
	public String stype() {
		System.out.println("created snake type bean...");
		String ref = new String("no-veg");
		return ref;
	}

	@Bean
	public String spoisionous() {
		System.out.println("created snake poisionous bean...");
		String ref = new String("neurotoxins");
		return ref;
	}

	@Bean
	public String ename() {
		System.out.println("created engine name bean...");
		String ref = new String("car");
		return ref;
	}

	@Bean
	public String etype() {
		System.out.println("created engine type bean...");
		String ref = new String("Electric engine");
		return ref;
	}

	@Bean
	public int enumber() {
		System.out.println("created engine number bean...");

		return 3456;
	}

	@Bean
	public int eversion() {
		System.out.println("created engine version bean...");
		return 11;
	}

	@Bean
	public String ecompany() {
		System.out.println("created engine company bean...");
		String ref = new String("Benz");
		return ref;
	}

	@Bean
	public String estrokes() {
		System.out.println("created engine strokes bean...");
		String ref = new String("intake");
		return ref;
	}

	@Bean
	public Ghost ghost() {
		System.out.println("created ghost bean..");
		Ghost ghost = new Ghost("Anamamma", "female", 60, "black", 4, "White color saree", "property", "Nagaraddi",
				1773, 50);
		return ghost;

	}

	@Bean
	public boolean gveg() {
		System.out.println("created ghost  veg bean..");
		return true;
	}

	@Bean
	public String gfevFood() {
		System.out.println("created ghost fevFood bean..");
		String ref = new String("sajjaka");
		return ref;
	}

	@Bean
	public String gfevFood() {
		System.out.println("created ghost fevFood bean..");
		String ref = new String("sajjaka");
		return ref;
	}

	@Bean
	public String gtype() {
		System.out.println("created ghost type bean..");
		String ref = new String("Normal");
		return ref;
	}

	@Bean
	public String gloction() {
		System.out.println("created ghost loction bean..");
		String ref = new String("Gonal");
		return ref;
	}

	@Bean
	public int gdeathOfDate() {
		System.out.println("created ghost death Of Date bean..");

		return 2016;
	}

	@Bean
	public boolean geduction() {
		System.out.println("created ghost eduction bean..");
		return false;
	}

	@Bean
	public double gphoneNo() {
		System.out.println("created ghost fevFood bean..");
		return 7019336631d;
	}

	@Bean
	public String gdeathType() {
		System.out.println("created ghost deathType bean..");
		String ref = new String("Parsi");
		return ref;
	}

	@Bean
	public String gmotherName() {
		System.out.println("created ghost mother Name bean..");
		String ref = new String("Vankammam");
		return ref;
	}

	@Bean
	public String gfatherName() {
		System.out.println("created ghost father Name bean..");
		String ref = new String("Hanamanthappa");
		return ref;
	}
}
