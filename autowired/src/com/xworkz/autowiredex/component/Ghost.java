package com.xworkz.autowiredex.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	private String name;
	private String gender;
	private int age;
	private String color;
	private int height;
	private String wearingDress;
	private String reason;
	private String enemy;
	private int birthDate;
	private int weight;
	@Autowired
	@Qualifier("gveg")
	private boolean veg;
	@Autowired
	@Qualifier("gfevFood")
	private String fevFood;
	@Autowired
	@Qualifier("gtype")
	private String type;
	@Autowired
	@Qualifier("gloction")
	private String loction;
	@Autowired
	@Qualifier("gdeathOfDate")
	private int deathOfDate;
	@Autowired
	@Qualifier("geduction")
	private boolean eduction;
	@Autowired
	@Qualifier("gphoneNo")
	private double phoneNo;
	@Autowired
	@Qualifier("gdeathType")
	private String deathType;
	@Autowired
	@Qualifier("gmotherName")
	private String motherName;
	@Autowired
	@Qualifier("gfatherName")
	private String fatherName;

	public Ghost() {
		System.out.println("craeted gosth no-arg cons..");
	}

	@Autowired
	public Ghost(@Qualifier("gname") String name, @Qualifier("ggender") String gender, @Qualifier("gage") int age,
			@Qualifier("gcolor") String color, @Qualifier("gheight") int height,
			@Qualifier("gwearing") String wearingDress, @Qualifier("greason") String reason,
			@Qualifier("genemy") String enemy, @Qualifier("gbirthDate") int birthDate,
			@Qualifier("gweight") int weight) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.color = color;
		this.height = height;
		this.wearingDress = wearingDress;
		this.reason = reason;
		this.enemy = enemy;
		this.birthDate = birthDate;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", gender=" + gender + ", age=" + age + ", color=" + color + ", height=" + height
				+ ", wearingDress=" + wearingDress + ", reason=" + reason + ", enemy=" + enemy + ", birthDate="
				+ birthDate + ", weight=" + weight + ", veg=" + veg + ", fevFood=" + fevFood + ", type=" + type
				+ ", loction=" + loction + ", deathOfDate=" + deathOfDate + ", eduction=" + eduction + ", phoneNo="
				+ phoneNo + ", deathType=" + deathType + ", motherName=" + motherName + ", fatherName=" + fatherName
				+ "]";
	}

}
