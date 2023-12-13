package com.mkpits.staticandnonstatic;

public class Static_Variable {
    
    public static String name = "Regved1";

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Types of calling static variable in the main method");
        System.out.println("Type-1: Direct calling of static variable inside a static method");
        System.out.println(name); // 1] Direct calling of static variable inside a static method.
        
        System.out.println("Type-2: Calling of static variable using class name reference");
        System.out.println(Static_Variable.name); // 2] Calling of static variable using class name reference
        
        // The following line should use the class name, not the instance
        System.out.println("Type-3: Calling static variable using class name reference");
        System.out.println(Static_Variable.name); // 3] Calling static variable using class name reference.
        System.out.println("--------------------------------------------------------------------");
    }
}
