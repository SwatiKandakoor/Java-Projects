package com.xworkz.collection.dto;

import java.io.Serializable;

public class AirportDto implements Serializable {

	private Double ticketPrice;
	private String source;
	private String destination;

	public AirportDto() {
		// TODO Auto-generated constructor stub
	}

	public AirportDto(Double ticketPrice, String source, String destination) {
		super();
		this.ticketPrice = ticketPrice;
		this.source = source;
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Airport [ticketPrice=" + ticketPrice + ", source=" + source + ", destination=" + destination + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals from airportDto");
		if (obj != null) {
			if (obj instanceof AirportDto) {
				AirportDto dto = (AirportDto) obj;
				if (dto.source.equals(this.source)) {
				//	System.out.println("properties are equal");
					System.out.println("source is matching "+dto.source);
					return true;

				} 
			}

		}
		return false;

	}

	public Double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
