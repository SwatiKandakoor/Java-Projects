package com.xworkz.springusingmethodscons.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springusingmethodscons.things.Actor;
import com.xworkz.springusingmethodscons.things.Rocket;
import com.xworkz.springusingmethodscons.things.Season;

@Configuration
@ComponentScan("com.xworkz.springusingmethodscons")
public class MethodAndConsConfigration {
	@Bean
	public Rocket newRocket() {
		System.out.println("created rocket bean..");
		Rocket ref = new Rocket();
		return ref;
	}

	@Bean
	public Actor newActor() {
		System.out.println("created new actor bean..");
		Actor ref = new Actor("Yash", "KGF", 38);
		return ref;
	}

	@Bean
	public Season newSeason() {
		System.out.println("created new season bean...");
		Season ref = new Season();
		ref.setName("Summer");
		ref.setDuration(4);
		ref.setStartingMonth(5);
		return ref;
	}
}
