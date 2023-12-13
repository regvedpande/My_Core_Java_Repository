package com.mkpits.controlflowstatements;

import java.io.*;

public class AnotherSwitchStatement {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1. Addition \n 2. Subtraction \n 3. Division \n 4. Multiplication \n 5. Exit \n Enter your choice: ");
        int choice = Integer.parseInt(br.readLine());

        System.out.println("Enter num1:");
        int num1 = Integer.parseInt(br.readLine());

        System.out.println("Enter num2:");
        int num2 = Integer.parseInt(br.readLine());

        int result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Addition of " + num1 + " and " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Subtraction of " + num1 + " and " + num2 + " = " + result);
                break;
            case 3:
                result = num1 / num2;
                System.out.println("Division of " + num1 + " and " + num2 + " = " + result);
                break;
            case 4:
                result = num1 * num2;
                System.out.println("Multiplication of " + num1 + " and " + num2 + " = " + result);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}

