package com.etp.collection.list;

import com.etp.collection.model.Song;

public class EqualDemo {
	
	public static void main(String[] args) {
		
		Song s1= new Song(10, "Tere lite", "Arjit", "2018"); // 100
		
		Song s2= new Song(10, "Tere lite", "Arjit", "2018"); // 200
		
		//s1=s2;
		
		System.out.println(s1.equals(s2));  // Object Class Equal : Reference comaparision
		
		
		String ss= new String();
		
	}
	

}
