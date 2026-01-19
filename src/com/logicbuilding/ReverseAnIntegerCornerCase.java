package com.logicbuilding;

public class ReverseAnIntegerCornerCase {

	public static void main(String[] args) {
		int number = 2147483646;
		int reverseNumber = 0;
		int lastDigit;
		
		while(number !=0) {
			lastDigit = number%10;
			if (reverseNumber > Integer.MAX_VALUE/10 || reverseNumber == Integer.MAX_VALUE/10 && lastDigit > 7) { //if (reverseNumber >= Integer.MAX_VALUE/10 && lastDigit > 7) not same
				System.out.println(0);
				System.exit(0);
			}
			if (reverseNumber < Integer.MIN_VALUE/10 || reverseNumber == Integer.MIN_VALUE/10 && lastDigit < -8) { //if (reverseNumber >= Integer.MAX_VALUE/10 && lastDigit > 7) not same
				System.out.println(0);
				System.exit(0);
			}
			reverseNumber = (reverseNumber*10) + lastDigit; 
			number = number/10; 
		}
		
		System.out.println(reverseNumber);
		

	}

}
