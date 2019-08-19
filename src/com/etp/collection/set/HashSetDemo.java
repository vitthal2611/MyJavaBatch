package com.etp.collection.set;

import java.util.HashSet;
import java.util.Set;

import com.etp.collection.model.Song;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		Set<Song> songSet = new HashSet<>();
		
		songSet.add(new Song(10, "dd", "ygyu", "hgg"));
		
		songSet.add(null);
		
		songSet.add(null);
		
		System.out.println(songSet.size());
		
				
		
		
		
		
	}

}
