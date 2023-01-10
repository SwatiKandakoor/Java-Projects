package com.xworkz.springusingmethodscons.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springusingmethodscons.configration.MethodAndConsConfigration;
import com.xworkz.springusingmethodscons.things.Actor;
import com.xworkz.springusingmethodscons.things.Rocket;
import com.xworkz.springusingmethodscons.things.Season;

public class RocketRunner {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MethodAndConsConfigration.class);
		String[] name=context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(name));
		Rocket rocket=context.getBean("rocket",Rocket.class);
		System.out.println("created literal variabels in rocket class..... ");
		System.out.println(rocket.hashCode());
		System.out.println(rocket.getCountry());
		System.out.println(rocket.getName());
		System.out.println(rocket.getBudget());
		
		Rocket rocket1=context.getBean("newRocket",Rocket.class);
		System.out.println("created literal variabels in rocket class..... ");
		System.out.println(rocket1.hashCode());
		System.out.println(rocket.getCountry());
		System.out.println(rocket.getName());
		System.out.println(rocket.getBudget());
		
		
		Actor actor=context.getBean("actor",Actor.class);
		System.out.println("created cons variables in actor class.....");
		System.out.println(actor.hashCode());
		System.out.println(actor.getName());
		System.out.println(actor.getLang());
		System.out.println(actor.getAge());
		
		Actor actor1=context.getBean("newActor",Actor.class);
		System.out.println("created cons variables in actor class.....");
		System.out.println(actor1.hashCode());
		System.out.println(actor1.getName());
		System.out.println(actor1.getLang());
		System.out.println(actor1.getAge());
		
		
		Season season=context.getBean("season",Season.class);
		System.out.println("created methods variables in season class.....");
		System.out.println(season.hashCode());
		System.out.println(season.getName());
		System.out.println(season.getStartingMonth());
		System.out.println(season.getDuration());
		
		Season season1=context.getBean("newSeason",Season.class);
		System.out.println("created methods variables in season class.....");
		System.out.println(season1.hashCode());
		System.out.println(season1.getName());
		System.out.println(season1.getStartingMonth());
		System.out.println(season1.getDuration());
		
	}

}
