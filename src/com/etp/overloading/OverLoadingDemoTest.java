package com.etp.overloading;

public class OverLoadingDemoTest {

	public static void main(String[] args) {
		
		
		OverLoadingDemo demo= new OverLoadingDemo();
		
		demo.sum(10); //20
		
		demo.sum(10.5); //  21
		
		demo.sum(10.5, 10.5); //21
		
		demo.sum(10, 10.5); //20.5
		
		demo.sum(10.5, 10); //20.5
	}
}
