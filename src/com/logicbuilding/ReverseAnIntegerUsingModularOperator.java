package com.logicbuilding;

public class ReverseAnIntegerUsingModularOperator {

	public static void main(String[] args) {
		int number = -123;
		int reverseNumber = 0;
		int lastDigit;
		
		while(number !=0) {
			lastDigit = number%10;// -123%10 = -3
			reverseNumber = (reverseNumber*10) + lastDigit; // (0*10) + (-3) = -3
			number = number/10; // -123/10 = -12
		}
		
		System.out.println(reverseNumber);
		

	}

}
