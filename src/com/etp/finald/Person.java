package com.etp.finald;

import com.etp.model.Address;

public class Person {
	
	public int id;
	
	public String name;
	
	public final String country ;
	
	public final Address adr = new Address(411, "Pune", "MH"); //100
	
	

	public Person(int id, String name, String country, Address adr) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		
	}






	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", country=" + country + ", adr=" + adr + "]";
	}
	

	
}
