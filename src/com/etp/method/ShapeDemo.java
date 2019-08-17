package com.etp.method;

public class ShapeDemo {

	public static void main(String[] args) {

		// Calling static Method
		/*
		 * Shape.drawCircleStatic(); // ClassName.MethodName
		 * 
		 * Shape s= new Shape(); // Both - Static Instance
		 * 
		 * s.drawCircle();
		 * 
		 * Shape s2= null;
		 * 
		 * Shape.drawCircleStatic();
		 * 
		 * // Instnce Varibale
		 * 
		 * System.out.println(s.point);
		 */

		Shape s = new Shape(); 

		s.drawCircle();
		
		Shape s2 = new Shape(); 

		s2.drawCircle();
	}

}
