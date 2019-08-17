package com.etp.inheritance;

public class DogTest {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		d.eat();
		d.voice();
		d.run();
		
		System.out.println(d.leg); // 4
		
		
		Animal a= new Dog(); // Dynanmic Dispatche
		
		a.eat();
		a.voice();
		
		System.out.println(a.leg); // 0
		
		
	}
}
