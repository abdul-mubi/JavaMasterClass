package com.logicbuilding;

public class EvenOddNumberWithoutMathsOperator {

	public static void main(String[] args) {
		int number = 10;
		if ((number & 1) == 0) {
			System.out.println("It is even number");
		}else if((number & 1) == 1) {
			System.out.println("It is odd number");
		}

	}

}
