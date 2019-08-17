package com.etp.inheritance;

public class DTest {

	public static void main(String[] args) {
		
		
		D d= new D();
		
		//System.out.println(d.a);
		System.out.println(d.b);
		
		System.out.println(d.c); //
		
		
		C c= new D(); // Dynamic Dispatche
		
		System.out.println(c.b);

		System.out.println(c.c);

		
	}
	
}
