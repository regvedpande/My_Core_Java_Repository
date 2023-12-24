package com.mkpits.typeconversion;

public class ImplicitAndExplicitCasting {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		main(a);

		// Converting the int to short
		// int a = 5;
		// short s1 = (short) a;
		// System.out.println(s1);

		// Converting the float to int
		String z = "45687";
		double y = Double.parseDouble(z);
		System.out.println(y);

		// converting the double to float
		String h = "5";
		int i = Integer.parseInt(h);
		System.out.println(i);

		String j = "batman";
		char ch = j.charAt(0); // special for converting string to character
		System.out.println(ch);

		String a2 = "722456.97";
		float f2 = Float.parseFloat(a2);
		System.out.println(f2);

	}

	// These are extra concepts regarding String[]args it is also called method
	// overloading
	public static void main(int[] args) {

		for (int i = 0; i < args.length; i++) {

			System.out.println(args[i]);
		}
		int a = 5;
		short s1 = (short) a;
		System.out.println(s1);
	}
}

/*
 * class Parent {} class Child extends Parent {}
 * 
 * public class ObjectCasting { public static void main(String[] args) { Parent
 * parent = new Child(); // Upcasting (implicit) Child child = (Child) parent;
 * // Downcasting (explicit) //We are typecasting it to child then assigning it
 * to child object } }
 */
