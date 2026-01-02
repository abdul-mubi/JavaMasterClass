package com.calculator;

public class CalculatorApp {

	public static void main(String[] args) {
		double number1 = 10;
		int number2 = 5;
		
		CalculatorApp obj = new CalculatorApp();
		
		System.out.println(obj.calculateSum(number1, number2));
		System.out.println(obj.calculateSubraction(number1, number2));
		System.out.println(obj.calculateDivision(number1, number2));
		System.out.println(obj.calculateMultiplication(number1, number2));
		
	}
	
	double calculateSum(double number1, int number2) {
		return number1 + number2 ;
	}
	
	double calculateSubraction(double number1, int number2) {
		return number1 - number2 ;
	}
	
	double calculateDivision(double number1, int number2) {
		return number1 / number2 ;
	}
	
	double calculateMultiplication(double number1, int number2) {
		return number1 * number2 ;
	}

}
