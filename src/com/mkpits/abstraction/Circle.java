package com.mkpits.abstraction;

class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * radius * radius;
	}

	@Override
	double perimeter() {
		return 2 * Math.PI * radius;
	}
}