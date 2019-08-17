package com.etp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List22 {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();  // I2C

		List <String> al2 = new ArrayList<>();
		
		List<String> al3= new LinkedList<>();
		
		
		al2.add("Sugar");

		al2.add("banan");

		al.add("Sugar");

		al.add("banan");

		al.add("Oil");
		
		al2.add("Oil");

		

		

		/*System.out.println(al.size());

		System.out.println(al.remove(0));

		System.out.println(al);*/
		
		//System.out.println(al2.containsAll(al));;
		
		for (String item : al) {
			
			System.out.println(item);
		}
		
		for (Iterator iterator = al2.iterator(); iterator.hasNext();) {
			String item = (String) iterator.next();
			
			System.out.println("Hi  ::;  "+item);
			
		}
		
	}

}
