package com.xworkz.autowiredex.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowiredex.component.Engine;
import com.xworkz.autowiredex.component.Ghost;
import com.xworkz.autowiredex.component.NewsPaper;
import com.xworkz.autowiredex.component.Snake;
import com.xworkz.autowiredex.configration.ConfigrationClass;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigrationClass.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		NewsPaper paper = context.getBean(NewsPaper.class);
		System.out.println(paper);

		Snake snake = context.getBean(Snake.class);
		System.out.println(snake);
		
		Engine engine=context.getBean(Engine.class);
		System.out.println(engine);
		
		Ghost ghost=context.getBean(Ghost.class);
		System.out.println(ghost);
	}

}
