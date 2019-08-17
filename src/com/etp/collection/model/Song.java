package com.etp.collection.model;

public class Song implements Comparable<Song> {

	public int songId;

	public String songName;

	public String singerName;

	public String yearPublished;

	public Song(int songId, String songName, String singerName, String yearPublished) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.singerName = singerName;
		this.yearPublished = yearPublished;
	}

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public String getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(String yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	public String toString() {
		return "Song [songId=" + songId + ", songName=" + songName + ", singerName=" + singerName + ", yearPublished="
				+ yearPublished + "]";
	}

	@Override
	public int compareTo(Song s) {
		return this.getSongName().compareTo(s.getSongName());
	}

	@Override
	public boolean equals(Object obj) {
		Song s = (Song) obj;
		return this.getSongName().equals(s.getSongName());
	}

}
