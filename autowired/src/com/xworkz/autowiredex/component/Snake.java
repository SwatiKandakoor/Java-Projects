package com.xworkz.autowiredex.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	private String name;
	@Autowired
	private int length;
	@Autowired
	@Qualifier("scolor")
	private String color;
	private String type;
	private String poisionous;

	@Autowired
	public Snake(@Qualifier("sname") String name, @Qualifier("stype") String type,
			@Qualifier("spoisionous") String poisionous) {
		super();
		this.name = name;
		this.type = type;
		this.poisionous = poisionous;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisionous="
				+ poisionous + "]";
	}

}
