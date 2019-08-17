package com.etp.statics;

public class CountStaticTest {

	public static void main(String[] args) {

		CountStatic c = new CountStatic();

		c.countIncrement();

		CountStatic cc = new CountStatic();

		cc.countIncrement();
		cc.countIncrement();

		System.out.println(c.getCount());
		System.out.println(cc.getCount());
	}
}
