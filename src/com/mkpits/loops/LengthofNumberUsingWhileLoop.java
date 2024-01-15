package com.mkpits.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LengthofNumberUsingWhileLoop {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number : ");
        int number = Integer.parseInt(br.readLine());

        int store = number;
        int length = 0;
        while (store != 0) {
            store = store / 10;
            length = length + 1;
        }

        System.out.println(length);
    }

    
}

