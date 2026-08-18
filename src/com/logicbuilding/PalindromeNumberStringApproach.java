package com.logicbuilding;

public class PalindromeNumberStringApproach {

	public static void main(String[] args) {
		int number = 121;
		
		String strNumber = Integer.toString(number);
		StringBuilder sb = new StringBuilder(strNumber);
		String reversedNumber = sb.reverse().toString();
		
		if (strNumber.equals(reversedNumber)) {
			System.out.println("Given number is Palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
		

	}

}
