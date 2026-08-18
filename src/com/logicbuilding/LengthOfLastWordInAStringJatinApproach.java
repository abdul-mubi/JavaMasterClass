package com.logicbuilding;

import java.util.Arrays;

public class LengthOfLastWordInAStringJatinApproach {

	public static void main(String[] args) {
		String s = "              Hello       World           -abdul1               ";
//		s = s.trim();
		char[] charArray = s.toCharArray();
		System.out.println(Arrays.toString(charArray));
		int count = 0;
		
		for(int i = charArray.length-1; i>=0; i--) {
			if (charArray[i] != ' ') {
				count++;
			}else {
				if( count > 0) {
					break;
				}
			}
		}
		
		System.out.println("Length of last word is "+count);

	}

}
