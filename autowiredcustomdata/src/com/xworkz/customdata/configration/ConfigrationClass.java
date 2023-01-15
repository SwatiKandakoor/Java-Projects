package com.xworkz.customdata.configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.customdata")
public class ConfigrationClass {

	public ConfigrationClass() {
		System.out.println("created configration no-arg cons...");
	}

}
