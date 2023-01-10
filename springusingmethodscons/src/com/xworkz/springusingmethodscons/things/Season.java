package com.xworkz.springusingmethodscons.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	private String name;
	private int duration;
	private int startingMonth;

	public Season() {
		System.out.println("created default Season constractor...");

	}

	public String getName() {
		return name;
	}

	@Value("Monsoon")
	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	@Value("4")
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getStartingMonth() {
		return startingMonth;
	}

	@Value("7")
	public void setStartingMonth(int startingMonth) {
		this.startingMonth = startingMonth;
	}

}
