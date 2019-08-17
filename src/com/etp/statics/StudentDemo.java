package com.etp.statics;

public class StudentDemo {
	public static void main(String[] args) {

		Student s1= new Student(10, "A", "MIT");
		Student s2= new Student(11, "B", "MIT");
		Student s3= new Student(12, "c", "MIT");
		
		System.out.println(s1.getName() + " "+ s1.getCollegeName());
		
		s2.setCollegeName("Sinhgad");
		System.out.println(s2.getName() + " "+ s2.getCollegeName());
		
		System.out.println(s3.getName() + " "+ s3.getCollegeName());
		
	
	}
}
