package com.mkpits.collectionframeworks;

import java.util.ArrayList;

public class EliminateTypeCasting {

    public static void main(String[] args) {

        // Using generics with an array
        Integer[] array = new Integer[10];
        array[0] = 10;
        int assign = array[0];
        System.out.println(assign);
        System.out.println(array.length);

        // Using generics with ArrayList
        ArrayList<Object> array2 = new ArrayList<>();
        array2.add(28);
        array2.add("Rabbit");
        array2.add('P');
        array2.add(9049874883L);
        array2.add(90.42);

        int i = (Integer) array2.get(0); // Type casting is still needed here
        System.out.println(i);

        System.out.println(array2.get(0));
        System.out.println(array2.get(1));
        System.out.println(array2.get(2));
        System.out.println(array2.get(3));

        // Generic Version
        ArrayList<Integer> array3 = new ArrayList<>();
        array3.add(23);

        System.out.println(array3.get(0));
    }
}
