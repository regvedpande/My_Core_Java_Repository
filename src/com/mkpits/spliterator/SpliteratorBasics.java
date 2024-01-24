package com.mkpits.spliterator;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorBasics {

	public static void main(String[] args) {

		ArrayList<String> sports = new ArrayList<String>();
		sports.add("Badminton");
		sports.add("Tennis");
		sports.add("Cricket");
		sports.add("Golf");
		sports.add("Football");

		Stream<String> str = sports.stream();

		Spliterator<String> split = str.spliterator();

		System.out.println(split.characteristics());

		System.out.println(split.estimateSize());

		System.out.println(split.getExactSizeIfKnown());

		System.out.println(split.hasCharacteristics(2));
	}

}
