package com.mkpits.method;

public class CallingMethodUsingVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String uname="rigvedpande";
		String pass="12345678";
		MethodWithArguementAndNoReturnType vb= new MethodWithArguementAndNoReturnType();
		vb.getUser(uname);
		vb.getPassword(pass);
		
	}
	
	public void getUser(String uname) {
		System.out.println("User Name is :-" +uname);
	}

	public void getPassword(String pass) {
		System.out.println("Password :- " +pass);
	

}
}
