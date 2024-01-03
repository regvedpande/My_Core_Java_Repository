package com.mkpits.abstraction;

public class CarCalling {

	public static void main(String[] args) {
		System.out.println("Honda Car Specification");
		Honda h = new Honda();
		h.engine();
		h.battery();
		h.steeringwheel();

		System.out.println("BMW specificatio ");
		BMW b = new BMW();
		b.battery();
		b.engine();
		b.steeringwheel();

	}
}