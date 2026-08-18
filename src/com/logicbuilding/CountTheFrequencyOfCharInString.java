package com.logicbuilding;

import java.util.HashMap;
import java.util.Map;

public class CountTheFrequencyOfCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "madam";
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		for(char c:name.toCharArray()) {
			if(map.keySet().contains(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);

	}

}
