package com.mkpits.linkedlist;


public class SomeRandom {

    public static void main(String[] args) {
        String name  = "Apple";
        int index = 0;
        while (index < name.length()) { 
            if (name.charAt(index) == 'p'){
                name.replace('p', 'r');
                break;
            }
        }    
        index++;  

        System.out.println("Your Text is " + name);

    }
}
