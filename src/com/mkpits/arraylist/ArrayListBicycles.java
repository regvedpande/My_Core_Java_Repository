package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListBicycles {
    public static void main(String[] args) throws NumberFormatException, IOException {

        ArrayList<String> bicycles = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Bicycles you want to buy: ");
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            System.out.println("Enter Bicycle Number");
            bicycles.add(br.readLine());
        }

        System.out.println("Your List of Bicycles are: " + bicycles);

        System.out.println("Do you wish to Remove any Bicycle: ");
        String remove = br.readLine();

        // Remove the bicycle only if it exists in the list
        if (bicycles.remove(remove)) {
            System.out.println("Bicycle removed successfully.");
        } else {
            System.out.println("Bicycle not found in the list.");
        }

        // Display the updated list
        Object[] bicycle = bicycles.toArray();
        System.out.println("Your Updated List of Bicycles are: " + bicycle);
    }
}
