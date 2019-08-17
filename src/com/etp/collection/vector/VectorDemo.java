package com.etp.collection.vector;


import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector< String> v= new Vector<>();
		
		v.add("Sugar");
		v.add("Potato");
		v.add("Oil");
		
	/*	
		for (String item : v) {
			
			System.out.println(item);
		}*/

		// enumeration 
		/*
		Enumeration<String> enumeration = v.elements();
		
		while (enumeration.hasMoreElements()) {
			String item = (String) enumeration.nextElement();
			System.out.println(item);
		}
		*/
		
		Iterator<String> itr = v.iterator();
		
		while (itr.hasNext()) {
			
			String item = (String) itr.next();
			
			System.out.println(item);
		}
		
		ListIterator<String> litr = v.listIterator();
		
		while (litr.hasNext()) {
			String string = (String) litr.previous();
			v.add("Rice");
			System.out.println(string);
		}
		
		// Reverse  ---Remove -- Add
	}
	
}
