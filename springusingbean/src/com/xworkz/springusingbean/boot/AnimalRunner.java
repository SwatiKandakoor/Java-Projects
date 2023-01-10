package com.xworkz.springusingbean.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springusingbean.configration.SpringConfigartion1;
import com.xworkz.springusingbean.things.Animal;

public class AnimalRunner {
	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfigartion1.class);
		String[] animal = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(animal));

		String ref = spring.getBean("eat", String.class);
		System.out.println(ref.hashCode());

		Animal animal1 = spring.getBean(Animal.class);
		System.out.println(animal1);
	}

}
