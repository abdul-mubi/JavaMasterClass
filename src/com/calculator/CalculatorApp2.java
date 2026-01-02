package com.calculator;

public class CalculatorApp2 {// Example of method Overloading
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		int number3 = 30;
		
		System.out.println(sumOfNumbers(number1, number2));
		System.out.println(sumOfNumbers(number1, number2, number3));
		
	}
	
	static int sumOfNumbers(int number1, int number2) { // Default access modifier
		return number1 + number2;
		
	}
	
	static int sumOfNumbers(int number1, int number2, int number3) { // Default access modifier
		return number1 + number2 + number3;
	}

}
