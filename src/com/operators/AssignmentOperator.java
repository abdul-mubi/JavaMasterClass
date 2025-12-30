package com.operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a = 1;
		
		int b = 1;
		
		a = a+ b;
		System.out.println(a);
		
		int c = 1;
		int d = 1;
		//Compound assignment operator
		c += d;
		System.out.println(c);
	}

}
