package com.etp.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.etp.collection.model.Song;

public class SongListDemo {

	public static void main(String[] args) {

		List<Song> songList = new ArrayList<Song>();

		addSongList(songList);

		System.out.println("Before Sorting");

		for (Song song : songList) {
			System.out.println(song);
		}

		// Sorted List..

		System.out.println("Sorting :: Comparable ");

		Collections.sort(songList);

		System.out.println("printing after Comparable Sorting");

		for (Song song : songList) {
			System.out.println(song);
		}

		System.out.println("Sorting :: Comparator ");

		Collections.sort(songList, new SongNameComparator());
		
		//Collections.sort(songList, new SongYearComparator());

		System.out.println("printing after Comparator Sorting");

		for (Song song : songList) {
			System.out.println(song);
		}

		// Duplicate Removal Set

		Set<Song> songset = new HashSet(songList);
		
		// Add -- Hashcode -- index
		
		// Same HashCode --- Equal
		

		System.out.println("After removing Duplicate Element");

		for (Song song : songset) {
			System.out.println(song);
		}

	}

	private static void addSongList(List<Song> songList) {

		songList.add(new Song(1, "Aaj Se teri", "Lata", "2018"));  // 4
		songList.add(new Song(2, "Tere Mere", "Mica", "2019"));
		songList.add(new Song(3, "Enna Sona", "Arjit", "2017")); // 4
		songList.add(new Song(4, "Enna Sona", "Arjit", "2017")); //4
		songList.add(new Song(4, "Enna Sona", "Arjit", "2017"));  // 4

	}

}
