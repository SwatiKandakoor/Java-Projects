package com.xworkz.collection.dto;

public class HolidayDto {
	private int noOfDays;
	private String reasons;
	private boolean holiday;

	public HolidayDto() {
		// TODO Auto-generated constructor stub
	}

	public HolidayDto(int noOfDays, String reasons, boolean holiday) {
		super();
		this.noOfDays = noOfDays;
		this.reasons = reasons;
		this.holiday = holiday;
	}

	@Override
	public String toString() {
		return "HolidayDto [noOfDays=" + noOfDays + ", reasons=" + reasons + ", holiday=" + holiday + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof HolidayDto) {
				HolidayDto dto = (HolidayDto) obj;
				if (dto.reasons.equals(this.reasons)) {
					System.out.println("reasons is matching " + dto.reasons);
					return true;
				}
			}
		}
		return false;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getReasons() {
		return reasons;
	}

	public void setReasons(String reasons) {
		this.reasons = reasons;
	}

	public boolean isHoliday() {
		return holiday;
	}

	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}

}
