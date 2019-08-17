package com.etp.thisd;

public class D extends C {

	D() {
		this(10);
		System.out.println("Default Constructor");
	}

	D(int x) {
		this(10, 30);
		System.out.println("Parametrized Constructor" + x);

	}

	D(int x, int y) {
		System.out.println("Parametrized Constructor" + x);

	}

	// int a = 40;

	void m1() {

		int a = 50;

		System.out.println(a); // 50

		System.out.println(this.a); // 40

		System.out.println(super.a); // 30

		B b = new B();

		System.out.println(b.a); // 20

		A aa = new A();

		System.out.println(aa.a); // 10

	}

}
