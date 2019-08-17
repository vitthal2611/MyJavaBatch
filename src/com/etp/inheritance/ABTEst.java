package com.etp.inheritance;

public class ABTEst {

	public static void main(String[] args) {
		/*
		 * A a = new A();
		 * 
		 * System.out.println(a.a); // 10
		 * 
		 * System.out.println(a.b); //20
		 * 
		 * //System.out.println(a.c);
		 * 
		 * a.m1(); // A- m1 a.m2(); // A- m2
		 * 
		 * 
		 * B b = new B();
		 * 
		 * System.out.println(b.a); //10 System.out.println(b.b); //30
		 * System.out.println(b.c); //40
		 * 
		 * b.m1(); // A-m1 b.m2(); //b - m2 b.m3(); // b m3
		 * 
		 * 
		 * 
		 * A aa = new B();
		 * 
		 * System.out.println(aa.a); // 10
		 * 
		 * System.out.println(aa.b); // 20
		 * 
		 * //System.out.println(aa.c);
		 * 
		 * 
		 * aa.m1(); // a-m1
		 * 
		 * aa.m2(); // b= m2
		 * 
		 */
/*		A a = new A();

		B b = new B();

		a = b; // A a = new B()

		System.out.println(a.a);

		System.out.println(a.b);

		// System.out.println(a.c);

		a.m1();

		a.m2();

		// B b= new A(); // Syntax error
*/
		A aa = new A();

		B bb = new B();

		// a = b; // A a = new B()

		bb=(B)aa;  // B b = (B )new A()
		
		System.out.println(bb.a);
	}

}
