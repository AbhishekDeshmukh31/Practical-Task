package com.tka;

public class Rectangle extends Shape {

	double length;
	double width;

	Rectangle() {

	}

	Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}

	@Override
	public double area() {
		double area = length * width;
		System.out.println("Calculating area " +area);
		return area;
	}
}
