package com.logicbuilding;

import java.util.HashSet;
import java.util.Set;

public class StringIsPangramOrNotUsingSet {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy dog";
		sentence = sentence.toLowerCase();
		
		boolean flag = checkPangram(sentence);
		
		if (flag)
			System.out.println("Given String is a Pangram");
		else
			System.out.println("Given string is not a Pangram");

	}
	
	private static boolean checkPangram(String sentence) {
		if(sentence.length() < 26) {
			return false;
		}
		char[] charArr = sentence.toCharArray();
		Set<Character> setChar = new HashSet<Character>();
		for(char c:charArr) {
			if (Character.isLetter(c)) {
				setChar.add(c);
			}
		}
		
		if(setChar.size() == 26) {
			return true;
		}
		
		return false;
		
	}

}
