package com.xworkz.collection.dto;

import java.io.Serializable;

public class CalendarDto implements Serializable {
	private int years;
	private int month;
	private int date;

	public CalendarDto() {
		// TODO Auto-generated constructor stub
	}

	public CalendarDto(int years, int month, int date) {
		super();
		this.years = years;
		this.month = month;
		this.date = date;
	}

	@Override
	public String toString() {
		return "CalendarDto [years=" + years + ", month=" + month + ", date=" + date + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals from CalendarDto");
		if (obj != null) {
			if (obj instanceof CalendarDto) {
				CalendarDto dto = (CalendarDto) obj;
				if (dto.years == this.years) {
					System.out.println("years is matching " + dto.years);
					return true;
				}

			}
		}

		return false;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

}
