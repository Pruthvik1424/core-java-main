package com.xworkz.collection.dto;

import java.io.Serializable;

public class StateDTO implements Serializable, Comparable<StateDTO> {

	private String name;
	private Long population;
	private Direction direction ;
	private String chiefMinister;
	private Double revenue;
	private Long budget;
	
	
	
	
	public StateDTO() {
		System.out.println("Running no param const........");
	}




	public StateDTO(String name, Long population, Direction direction, String chiefMinister, Double revenue,
			Long budget) {
		super();
		this.name = name;
		this.population = population;
		this.direction = direction;
		this.chiefMinister = chiefMinister;
		this.revenue = revenue;
		this.budget = budget;
	}




	@Override
	public String toString() {
		return "StateDTO [name=" + name + ", population=" + population + ", chiefMinister=" + chiefMinister
				+ ", revenue=" + revenue + ", budget=" + budget + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getPopulation() {
		return population;
	}


	public void setPopulation(Long population) {
		this.population = population;
	}


	public String getChiefMinister() {
		return chiefMinister;
	}


	public void setChiefMinister(String chiefMinister) {
		this.chiefMinister = chiefMinister;
	}


	public Double getRevenue() {
		return revenue;
	}


	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}


	public Long getBudget() {
		return budget;
	}


	public void setBudget(Long budget) {
		this.budget = budget;
	}


	public Direction getDirection() {
		return direction;
	}


	public void setDirection(Direction direction) {
		this.direction = direction;
	}




	@Override
	public int compareTo(StateDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}


	

	
	

}
