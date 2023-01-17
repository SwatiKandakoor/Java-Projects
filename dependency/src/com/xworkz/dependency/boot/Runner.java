package com.xworkz.dependency.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.dependency.component.Chrome;
import com.xworkz.dependency.configration.ConfigarationClass;
import com.xworkz.dependency.rule.PetrolBunk;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigarationClass.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		PetrolBunk bunk = context.getBean(PetrolBunk.class);
		System.out.println(bunk.purchase());

		Chrome chrome = context.getBean(Chrome.class);
		chrome.browse();

	}

}
