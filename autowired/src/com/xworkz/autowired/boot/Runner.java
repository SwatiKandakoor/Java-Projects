package com.xworkz.autowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired.component.HardwareShop;
import com.xworkz.autowired.component.Pencil;
import com.xworkz.autowired.component.Rubber;
import com.xworkz.autowired.component.Software;
import com.xworkz.autowired.component.SoftwareEngineer;
import com.xworkz.autowired.configration.AutowiredConfigration;
import com.xworkz.autowired.configration.RubberConfigration;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AutowiredConfigration.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		HardwareShop config=context.getBean(HardwareShop.class);
		System.out.println(config);
		
		Software software=context.getBean(Software.class);
		System.out.println(software);
		
		SoftwareEngineer engineer=context.getBean(SoftwareEngineer.class);
		System.out.println(engineer);
		
	    Pencil pencil=context.getBean(Pencil.class);
	    System.out.println(pencil);
	
		Rubber rubber=context.getBean(Rubber.class);
		System.out.println(rubber);
	}

}
