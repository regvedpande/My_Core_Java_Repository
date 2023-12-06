package com.mkpits.operators;

public class OperatorsinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		OperatorsinJava o = new OperatorsinJava();
		o.getArithmeticOperators(15);
		o.getAssignmentOperators(72);
		o.getLogicalOperators(4 , 9);
	
	}

	
	

	private void getArithmeticOperators(int a) {
		// TODO Auto-generated method stub
		System.out.println("Integer is : " +a);
	}
	
	private void getAssignmentOperators(int x) {
		// TODO Auto-generated method stub
		System.out.println(x+=10);
	}

	private void getLogicalOperators(int a, int c) {
		// TODO Auto-generated method stub
		boolean compare = a > 10 || c <10;
		System.out.println(compare);
	
	}


}
