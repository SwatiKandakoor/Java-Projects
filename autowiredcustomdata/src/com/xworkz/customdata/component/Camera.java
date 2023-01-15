package com.xworkz.customdata.component;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	private Lens lens;
	private Battery battery;

	public Camera() {
		System.out.println("craeted camera no-arg cons..");
	}

}
