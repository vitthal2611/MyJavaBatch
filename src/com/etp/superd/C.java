package com.etp.superd;

public class C extends B {

	C(){
		System.out.println("C");
	}
	
	C( int x){
		super(x,x);
		System.out.println(" X " +x);
	}
	
}
