package com.mkpits.method;

public class ThisKeyword {

	//Remember we are assigning value to the below keywords using this keyword
	int p , j;
	String h; 
	long num2;
	char g; 
	
	public String getInt(int i, int k){
		this.p = i;
		this.j = k;
	    String s = (p+","+j);
	    return s;

	}
	
	private String getString(String s) {
		this.h = s;
		return h;
	}
	
	public long getLong(long num) {
		this.num2 = num;
		return num2;
	}
	
	private char getChar(char c) {
		this.g = c;
		return g;
	}
	
   //private void getOutput() {
	  // System.out.println(getInt(90, 100));
	  // System.out.println(getString("Regved"));
	  // System.out.println(getLong(9049874883L));
	  // System.out.println(getChar('A'));
	   
  // }
	public static void main(String []args) {
		ThisKeyword k = new ThisKeyword();
		//k.getInt(90, 100);
		//k.getString("Regved");
		//k.getLong(9049874883L);
		//k.getChar('A');
		//k.getOutput();
		System.out.println("----------------------------");
		System.out.println(k.getInt(90, 100));
		   System.out.println(k.getString("Regved"));
		   System.out.println(k.getLong(9049874883L));
		   System.out.println(k.getChar('A'));
	}
	
	
}