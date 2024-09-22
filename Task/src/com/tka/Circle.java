package com.tka;

public class Circle extends Shape {

	double radius;

	Circle() {

	}

	Circle(double r) {
		this.radius = r;
	}

	@Override
	public double area() {

		double area = Math.PI * (radius * radius);
		System.out.println("Calculating area " +area);
		return area;
	}
}
