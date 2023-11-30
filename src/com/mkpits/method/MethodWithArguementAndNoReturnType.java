package com.mkpits.method;

public class MethodWithArguementAndNoReturnType {

	
public static void main(String[] args) {
	

	MethodWithArguementAndNoReturnType n = new MethodWithArguementAndNoReturnType();
	n.getUser("Regved");
	n.getPassword("Regved123");
}

public void getUser(String user) {
	System.out.println("User Name is :-" +user);
}

public void getPassword(String password) {
	System.out.println("Password :- " +password);
}	
}