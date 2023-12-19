package com.mkpits.array;

public class ArrayPractice2 {

    public static void main(String[] args) {
        String[][] names = {
            {"ayush",  "regved"},
            {"sarvesh",  "sagar" }
        };

        for (int i = 0; i < names.length; ++i) {
            for (int j = 0; j < names[i].length; ++j) {
                System.out.println(names[i][j]); 
            }
        }
    }
}
