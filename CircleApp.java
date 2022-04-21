package za.ac.wsu.s219011273b;

import za.ac.wsu.s219011273.Circle;

public class CircleApp{
	public static void main(String[] args)
	{
		
		 Circle object1 = new Circle(10,2,1);
		 Circle object2 = new Circle(5,12,1);
		 Circle object3 = new Circle(3,7,9);
		 
		 System.out.println("Object1......................" + "\n");
		 
		 System.out.println("X = "+ object1.getX());
		 System.out.println("Y = " + object1.getY());
		 System.out.println("Radius = " + object1.getRadius());
		 object1.calculateArea();
		 object1.calculateCircumference();
		 object1.calculateDiameter();
		 
		 System.out.println("\n" + "Object2......................" + "\n");
		 
		 System.out.println("X = "+ object2.getX());
		 System.out.println("Y = " + object2.getY());
		 System.out.println("Radius = " + object2.getRadius());
		 object2.calculateArea();
		 object2.calculateCircumference();
		 object2.calculateDiameter();
		 
System.out.println("\n" + "Object3......................" + "\n");
		 
		 System.out.println("X = "+ object3.getX());
		 System.out.println("Y = " + object3.getY());
		 System.out.println("Radius = " + object3.getRadius());
		 object3.calculateArea();
		 object3.calculateCircumference();
		 object3.calculateDiameter();
	};	
};
