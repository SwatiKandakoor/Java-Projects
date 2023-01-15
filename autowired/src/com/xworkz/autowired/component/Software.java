package com.xworkz.autowired.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("softwareName")
	private String name;
	@Autowired
	@Qualifier("softwareVersion")
	private double version;
	@Autowired
	@Qualifier("softwareDeveloper")
	private String developer;
	@Autowired
	//@Qualifier("softwareData")
	private List data;
	@Autowired
	@Qualifier("softwareFree")
	private boolean free;

	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", data=" + data
				+ ", free=" + free + "]";
	}

}
