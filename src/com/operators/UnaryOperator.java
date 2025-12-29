package com.operators;

public class UnaryOperator {

	public static void main(String[] args) {
		int a = 5;
		
		int b = -a;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		int c = a++;//Post-increment
		System.out.println("a = "+a);
		System.out.println("c = "+c);
		
		int d = ++a;// Pre-increment
		System.out.println("a = "+a);
		System.out.println("d ="+d);
		
		int e = a--;//Post-decrement
		System.out.println("a = "+a);
		System.out.println("e = "+e);
		
		int f = --a;//Pre-decrement
		System.out.println("a = "+a);
		System.out.println("f = "+f);
		

	}

}
