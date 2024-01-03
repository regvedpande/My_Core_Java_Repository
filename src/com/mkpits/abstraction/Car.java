package com.mkpits.abstraction;

public abstract class Car {

	/*
	 * we cannot achieve 100% abstraction in abstract class because it have
	 * constructors, static and non static methods as compared to Interfaces which
	 * have by default abstract method
	 */
	int a;

	Car() {

	}

	public static void add() {

	}

	public void sub() {

	}

	public abstract void engine();

	public abstract void steeringwheel();

	public abstract void battery();

	public abstract void windshieldwipers();

}

class Honda extends Car {

	public void engine() {
		System.out.println("4 Stroke Engine");
	}

	public void steeringwheel() {
		System.out.println("Simple Steering Wheel");
	}

	public void battery() {
		System.out.println("14 Volts");
	}

	public void windshieldwipers() {
		System.out.println("Doble Basic Windshields");
	}

}

class BMW extends Car {

	public void engine() {
		System.out.println("V8 ");
	}

	@Override
	public void steeringwheel() {
		System.out.println("Sport type");

	}

	@Override
	public void battery() {
		System.out.println("20 volt");
	}

	@Override
	public void windshieldwipers() {
		System.out.println("Advanced");
	}

}
