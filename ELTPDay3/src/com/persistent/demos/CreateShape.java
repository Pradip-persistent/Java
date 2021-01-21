package com.persistent.demos;

public class CreateShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Shape circle=new Circle(5);
	Shape reactangle=new Rectangle(5, 7);
	System.out.println("Circle Area"+circle.calArea());
	System.out.println("Reactangle Area "+reactangle.calArea());

	}

}
