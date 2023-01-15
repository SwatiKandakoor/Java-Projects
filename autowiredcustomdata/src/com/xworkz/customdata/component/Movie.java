package com.xworkz.customdata.component;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	private Director director;
	private CameraMan cameraman;

	public Movie() {
		System.out.println("craeted movie no-arg cons..");
	}

}
