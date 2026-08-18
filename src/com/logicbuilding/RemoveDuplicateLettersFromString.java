package com.logicbuilding;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateLettersFromString {

	public static void main(String[] args) {
		String name = "Java";
		char[] nameArr = name.toCharArray();
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(char n:nameArr) {
			if (map.keySet().contains(n)) {
				map.put(n, map.get(n)+1); 
			}else {
				map.put(n, 1);
				System.out.println(n);
			}
		}

	}

}
