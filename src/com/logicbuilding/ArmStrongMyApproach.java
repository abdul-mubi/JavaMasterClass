package com.logicbuilding;

public class ArmStrongMyApproach {

	public static void main(String[] args) {
		int number = 1634;
		String strNum = ""+number;
		int numLen = strNum.length();
		int result = 0;
		while(number !=0) {
			int singleDigit = number%10;
			int multiplyValie = 1;
			for (int i=0;i<numLen;i++) {
				multiplyValie = multiplyValie * singleDigit;
			}
			result = result + multiplyValie;
			number = number/10;
		}
		System.out.println(result);
		
		if (strNum.equals(result+"")) {
			System.out.println("Given number is ArmStrong Number");
		}else {
			System.out.println("Given number is not an ArmStrong Number");
		}

	}

}
