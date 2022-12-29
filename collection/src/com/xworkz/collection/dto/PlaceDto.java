package com.xworkz.collection.dto;

import java.io.Serializable;

public class PlaceDto implements Serializable {
	private String name;
	private int distance;
	private String placeFamous;

	public PlaceDto() {

	}

	public PlaceDto(String name, int distance, String placeFamous) {
		super();
		this.name = name;
		this.distance = distance;
		this.placeFamous = placeFamous;
	}

	@Override
	public String toString() {
		return "PlaceDto [name=" + name + ", distance=" + distance + ", placeFamous=" + placeFamous + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals from airportDto");
		if (obj != null) {
			if (obj instanceof PlaceDto) {
				PlaceDto dto = (PlaceDto) obj;
				if (dto.name.equals(this.name)) {
					System.out.println("name is matching " + dto.name);
				
				return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getPlaceFamous() {
		return placeFamous;
	}

	public void setPlaceFamous(String placeFamous) {
		this.placeFamous = placeFamous;
	}

}
