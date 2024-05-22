package com.mkpits.exception;

public class NestedTry {
    public static void main(String[] args) {
        try {
            
            try {
                System.out.println("Dividing by Zero");
                int a = 2/0;

            } catch (ArithmeticException e) {

                e.printStackTrace();

            }

        System.out.println("Protocol Successful");

        } catch (Exception e) {

        }
    }
}
