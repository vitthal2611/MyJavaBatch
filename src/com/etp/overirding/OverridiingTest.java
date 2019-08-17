package com.etp.overirding;

import java.io.IOException;

public class OverridiingTest {
	
	public static void main(String[] args) {
		
		A a= new B() ; // Dynimic Dispatch
		
		a.m1();
		
	}

}
