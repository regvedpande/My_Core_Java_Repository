package com.mkpits.datatype;

public class ClassInit {
	// ClassDeclaration d=new ClassDeclaration();
	public static void main(String[] args) {
		ClassDeclaration d = new ClassDeclaration(20, 5.6f, 567.99, "Regved Panda");

		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		System.out.println(d.s);

	}

}
