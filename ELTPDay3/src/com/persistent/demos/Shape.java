package com.persistent.demos;

public class Shape {
	double calArea() {
		return 0.0;
	}
}

class Circle extends Shape{
	int redius;
	public Circle(int redius) {
		this.redius=redius;
	}
	double calArea() {
		return redius*redius* Math.PI;
	}
}
class Rectangle extends Shape{
	int l,b;
	public Rectangle(int l,int b) {
		this.l=l;
		this.b=b;
	}
	public double calArea() {
		return l*b;
	}
}