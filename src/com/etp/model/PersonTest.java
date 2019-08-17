package com.etp.model;

public class PersonTest {

	public static void main(String[] args) {
		
		Address adr= new Address(411052, "Pine", "MH");
		Person p= new Person(10, "John", adr);
		
		System.out.println(p.getId());
		

	}

}
