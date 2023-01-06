package com.xworkz.collection.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class MovieDTO implements Serializable{//, Comparable<MovieDTO> {
	private String name;
	private Double budget;
	private String language;
	private double profit;
	private LocalDate releaseDate;

	public MovieDTO() {
		// TODO Auto-generated constructor stub
	}

	public MovieDTO(String name, double budget, String language, double profit, LocalDate releaseDate) {
		super();
		this.name = name;
		this.budget = budget;
		this.language = language;
		this.profit = profit;
		this.releaseDate = releaseDate;
	}

	@Override
	public int hashCode() {
		
		return 40;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof MovieDTO) {
				MovieDTO dto = (MovieDTO) obj;
				if (dto.name.equals(this.name) && dto.language.equals(this.language)) {
					return true;
				}
			}
		}

		return false;
	}

//	@Override
//	public int compareTo(MovieDTO o) {
//
//		return this.budget.compareTo(o.budget);
//	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", budget=" + budget + ", language=" + language + ", profit=" + profit
				+ ", releaseDate=" + releaseDate + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

}
