package com.mkpits.method;

public class GetAndSet {
	
	int myNumber;

	
	public int getInt(int myNumber) {
		this.myNumber = myNumber;
		return myNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetAndSet g = new GetAndSet();
		g.getInt(65);
		
	}

	
	public int getMyNumber() {
		return myNumber;
	}

	//In these you are setting the value of local variable to global variable 
	//and then you are accessing it through getmyNumber
	public void setMyNumber(int myNumber) {
		this.myNumber = myNumber;
	}

}
