package com.operators;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		
		int result;
		double result1;
		double result2;
		
		result = number1 + number2;
		System.out.println(result);
		
		result = number1 - number2;
		System.out.println(result);
		
		result = number1 * number2;
		System.out.println(result);
		
		result = number1 / number2;// o/p is 0, because number1 and number2 are int, while java comparing biggest data type in terms of bit size between int and int is int.
		System.out.println(result);// Also result is int
		result1 = number1/ number2;// o/p is 0.0, because number1 and number2 are int, while java comparing biggest data type in terms of bit size between int and int is int.
		System.out.println(result1);// but result1 is doble, thats why o/p is 0.0
		result2 = ((double)number1/number2);// o/p is 0.5, because number1 is double and number2 is int, while java comparing biggest data type in terms of bit size between double and int is double.
		System.out.println(result2);// Also result2 is DOUBLE
		
		result = number1 % number2;
		System.out.println(result);
		
		
		
		

	}

}
