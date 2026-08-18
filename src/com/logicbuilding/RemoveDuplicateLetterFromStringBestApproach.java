package com.logicbuilding;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLetterFromStringBestApproach {

	public static void main(String[] args) {
		String name = "Java";
		char[] nameArr = name.toCharArray();
		Set<Character> setChar = new LinkedHashSet<Character>();
		
		for(char c : nameArr) {
			if(setChar.add(c)) {
				System.out.println(c);
			}
		}
		System.out.println(setChar);

	}

}
