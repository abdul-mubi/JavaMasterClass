package com.logicbuilding;

public class ArmStrongGeeksForGeeks {

	public static void main(String[] args) {
		int number = 1634;
		int numLen = getNumLen(number);
		int result = 0;
		int copy = number;
		int lastDigit;
		
		while(number !=0) {
			lastDigit = number%10;
			int multiplyValie = 1;
			for (int i=0;i<numLen;i++) {
				multiplyValie = multiplyValie * lastDigit;
			}
			result = result + multiplyValie;
			number = number/10;
		}
		System.out.println(result);
		
		if (copy == result) {
			System.out.println("Given number is ArmStrong Number");
		}else {
			System.out.println("Given number is not an ArmStrong Number");
		}

	}

	private static int getNumLen(int number) {
		int numLength = 0;
		while(number !=0) {
			numLength++;
			number = number/10;
		}
		return numLength;
	}

}
