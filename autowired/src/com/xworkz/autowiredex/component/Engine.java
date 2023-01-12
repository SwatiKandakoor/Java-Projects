package com.xworkz.autowiredex.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String name;
	private String type;
	@Autowired
	@Qualifier("enumber")
	private int number;
	@Autowired
	@Qualifier("eversion")
	private int version;
	private String company;
	private String strokes;

	@Autowired
	public Engine(@Qualifier("ename") String name, @Qualifier("etype") String type,
			@Qualifier("ecompany") String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}

	public String getStrokes() {
		return strokes;
	}

	@Qualifier("estrokes")
	public void setStrokes(String strokes) {
		this.strokes = strokes;
	}

}
