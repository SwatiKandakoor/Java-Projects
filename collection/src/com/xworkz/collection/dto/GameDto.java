package com.xworkz.collection.dto;

public class GameDto {
	private String name;
	private String type;
	private int noOfPlayers;

	public GameDto() {
		// TODO Auto-generated constructor stub
	}

	public GameDto(String name, String type, int noOfPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.noOfPlayers = noOfPlayers;
	}

	@Override
	public String toString() {
		return "GameDto [name=" + name + ", type=" + type + ", noOfPlayers=" + noOfPlayers + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals from CalendarDto");
		if (obj != null) {
			if (obj instanceof CalendarDto) {
				GameDto dto = (GameDto) obj;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

}
