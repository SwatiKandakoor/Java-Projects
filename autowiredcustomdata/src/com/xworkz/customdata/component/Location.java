package com.xworkz.customdata.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {
	@Autowired
	private Area area;

	public Location() {
		System.out.println("created location no-arg cons...");
	}
}
