package com.etp.model;

public class Person extends Object {

	public long id;

	public String name;

	public Address adr;
	

	public Person(long id, String name, Address adr) {
		super();
		this.id = id;
		this.name = name;
		this.adr = adr;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", adr=" + adr + "]";
	}
	
	

}
