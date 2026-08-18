package com.logicbuilding;

import java.util.Arrays;

public class LengthOfLastWordInAStringMyApproach {

	public static void main(String[] args) {
		String s = "              Hello       World           -abdul      k          ";
//		s = s.trim();
		String[] splittedS = s.split(" "); // by default split removes trailing empty spaces 
		                                   // if we want to maintain those then we can use override method split(" ",-1)
		System.out.println(Arrays.toString(splittedS));
		String lastWord = splittedS[splittedS.length-1];
		System.out.println(lastWord);
		System.out.println("Length of last word in a string "+ lastWord.length());
		
//		String[] b = {"Abdul","Mubi","Rayan"};
//		System.out.println(Arrays.toString(b));

	}

}
