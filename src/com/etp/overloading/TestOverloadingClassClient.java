package com.etp.overloading;

public class TestOverloadingClassClient {

	public static void main(String[] args) {
		
		A a= new A();
		
		B b= new B();
		
		C c = new C();
		
		TestOverloadingClass obj = new TestOverloadingClass();
		
		obj.m1(a);
		obj.m1(b);
		obj.m1(c);
		
		A ab= new B();
		
		B bc= new C();
		
		obj.m1(ab);
		
		obj.m1(bc);
		
	
		
	}
}
