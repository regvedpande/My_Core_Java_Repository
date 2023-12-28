package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayPractice7 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number");
		int[] array1 = new int[10];

		// int[] array2 = new int[10];

		// outer for loop
		for (int i = 0; i < array1.length; i++) {

			array1[i] = Integer.parseInt(br.readLine());
			Arrays.sort(array1);

		}

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0) {
				// array2[i] = array1[i];

				System.out.println(array1[i]);
			}

		}

	}
}
