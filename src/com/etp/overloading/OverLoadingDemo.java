package com.etp.overloading;

import java.sql.SQLDataException;

public class OverLoadingDemo {

	void sum(int a) {
		System.out.println(a + a);
	}

	void sum(double a) {
		System.out.println(a + a);
	}

	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(double a, double b) {
		System.out.println(a + b);
	}

	void sum(int a, double b) {
		System.out.println(a + b);
	}

	void sum(double a, int b) {
		System.out.println(a + b);
	}
}
