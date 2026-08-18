package com.logicbuilding;

public class PalindromeNumberApproach1 {

	public static void main(String[] args) {
		int number = 11111112;
		int reversedNumber = 0;
		int lastDigit;
		int copy = number;
		while(copy>0) {
			lastDigit = copy%10;
			reversedNumber = (reversedNumber * 10) + lastDigit;
			copy = copy /10;
		}
		if(number - reversedNumber == 0) {
			System.out.println("Given number is palindrome");
		}else {
			System.out.println("Given number is not a palindrome");
		}

	}

}
