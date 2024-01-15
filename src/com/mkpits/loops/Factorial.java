package com.mkpits.loops;

public class Factorial {

	public static void main(String[] args) {

		int regvedage = 5;
		int factorial = 1;
		int i = 1;

		int num = 10;
		while (i <= num) {
			factorial *= i;
			i++;
		}
		System.out.println("Factorial of " + num + " is: " + factorial);
	}

}
