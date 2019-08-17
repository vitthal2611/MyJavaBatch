package com.etp.overloading;

//2005

//2019 -- PassPort

public class Student {

	public int id;
	
	public String studentName;
	
	public long aadharCard;
	
	public long passport;
	
	public void studentRegistration(int id, String name, long aadharCard){
		
		System.out.println(id + " " + name + " " + aadharCard + " "+ passport);
	}
	
	public void studentRegistration(int id, String name, long aadharCard, long passport){
		studentRegistration(id,name,aadharCard);
		System.out.println(id + " " + name + " " + aadharCard + " "+ passport);
	}
	
}
