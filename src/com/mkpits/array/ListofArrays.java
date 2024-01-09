package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListofArrays {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int numbers[] = new int[10];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Array: ");

		/*
		 * array[0] = 1; array[1] = 2; array[2] = 3; array[3] = 4; array[4] = 5;
		 * array[5] = 5; array[6] = 6; array[7] = 7; array[8] = 8; array[9] = 10;
		 */

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = Integer.parseInt(br.readLine());

		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		/*
		 * System.out.println(numbers[0]); System.out.println(numbers[1]);
		 * System.out.println(numbers[2]); System.out.println(numbers[3]);
		 * System.out.println(numbers[4]); System.out.println(numbers[5]);
		 * System.out.println(numbers[6]); System.out.println(numbers[7]);
		 * System.out.println(numbers[8]); System.out.println(numbers[9]);
		 */
	}
}
