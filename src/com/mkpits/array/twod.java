package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class twod {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows: ");
        int rows = Integer.parseInt(br.readLine());

        System.out.println("Enter the number of columns: ");
        int columns = Integer.parseInt(br.readLine());

        int[][] numbers = new int[rows][columns];

        System.out.println("Enter the elements for the 2D array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                numbers[i][j] = Integer.parseInt(br.readLine());
            }
        }

        // Close the BufferedReader
        br.close();

        System.out.println("The 2D array is:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
