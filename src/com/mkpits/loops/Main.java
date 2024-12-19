package com.mkpits.loops;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name you want to add : ");
        String storeport = br.readLine();
        String anotherport = storeport;
        int index = 0;
        
        while (index < name.length()) { 
            if (name.charAt(index) == 'p') {
                name = name.replace('p', 'r');
                break; 
            }
            index++;  
        }    

        System.out.println("Your Modified name is " + name);
    }
}
