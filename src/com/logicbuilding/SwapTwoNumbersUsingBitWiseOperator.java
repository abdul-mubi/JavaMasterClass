package com.logicbuilding;

public class SwapTwoNumbersUsingBitWiseOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("Swapped");
		System.out.println("A = "+a+", B = "+b);

	}

}
