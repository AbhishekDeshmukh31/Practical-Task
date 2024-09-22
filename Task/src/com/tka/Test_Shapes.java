package com.tka;

import java.util.Scanner;

public class Test_Shapes {

	public static void main(String[] args) {

		Shape circle = new Circle(7);
		circle.area();

		Shape rectangle = new Rectangle(10,5);

		rectangle.area();

	}

}
