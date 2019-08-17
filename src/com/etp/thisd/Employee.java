package com.etp.thisd;

public class Employee extends Person {

	int age = 55;

	public void getName() {

		System.out.println("Employee age is  =" + super.age);

		super.getName();

	}

}
