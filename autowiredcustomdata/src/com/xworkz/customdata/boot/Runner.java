package com.xworkz.customdata.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.customdata.component.Producer;
import com.xworkz.customdata.configration.ConfigrationClass;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigrationClass.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		Producer producer = context.getBean(Producer.class);
		System.out.println(producer);
	}
}
