package com.etp.method;

public class Shape {

	{
		System.out.println("Instance Block");
	}

	static {
		System.out.println("Static Block");
	}

	int point; // Instance Variable

	// Method -- Instance Static

	public void drawCircle() {

		int point = 0;

		System.out.println("Drawing Circle and Point is " + point);
	}

	public static void drawCircleStatic() {

		System.out.println("Drawing Circle Static");
	}

}
