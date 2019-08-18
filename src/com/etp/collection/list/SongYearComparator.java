package com.etp.collection.list;

import java.util.Comparator;

import com.etp.collection.model.Song;

public class SongYearComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Song s1= (Song)o1;
		Song s2= (Song)o2;
		return s1.getYearPublished().compareTo(s2.getYearPublished());
	}

}
