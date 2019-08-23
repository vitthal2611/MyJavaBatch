package com.etp.collection.set;

public class Country implements Comparable<Country>{
	
	String name;
	
	String Population;

	public Country(String name, String population) {
		super();
		this.name = name;
		Population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPopulation() {
		return Population;
	}

	public void setPopulation(String population) {
		Population = population;
	}

	@Override
	public int compareTo(Country o) {
		// TODO Auto-generated method stub
		return this.getPopulation().compareTo(o.getPopulation());
	}

	// Proper Implementations of HAshCode and Equal method add here
	
}
