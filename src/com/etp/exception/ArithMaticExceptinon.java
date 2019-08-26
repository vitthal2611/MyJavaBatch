package com.etp.exception;

public class ArithMaticExceptinon {

	public static void main(String[] args) {

		m1();
	}

	public static int m1() {
		System.out.println("7");
		try {
			throw new Exception();
			
		} catch (Throwable e) {
			System.out.println("throw");
			int a = 10 / 0;

			System.out.println(e.getMessage());
			System.exit(0);
			return 0;
		} finally {
			System.out.println("In Finally Block");
			/*
			 * } System.out.println("8"); System.out.println("9");
			 */
			return 0;
		}
	}
}
