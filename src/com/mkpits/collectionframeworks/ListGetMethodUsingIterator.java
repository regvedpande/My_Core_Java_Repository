package com.mkpits.collectionframeworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListGetMethodUsingIterator {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<String> footballplayers = new ArrayList<String>();

		System.out.println("Enter the Players Name: ");

		for (int i = 0; i < 5; i++) {

			footballplayers.add(br.readLine());

		}

		System.out.println(footballplayers);

		ListIterator<String> iterator = footballplayers.listIterator();

		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);

		}

		for (String string : footballplayers) {

			System.out.println(string);
		}
	}
}
