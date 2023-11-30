package com.mkpits.method;

public class CallingMethod {

	public static void main(String[] args) {
		MethodWithArguementAndNoReturnType call = new MethodWithArguementAndNoReturnType();
	
		call.getUser("Regved");
		call.getPassword("Regved123");
		
		CallingMethodUsingVariable cm = new CallingMethodUsingVariable();
		cm.getUser("regvedpande");
		cm.getPassword("12345678");
		
	}
	
}
