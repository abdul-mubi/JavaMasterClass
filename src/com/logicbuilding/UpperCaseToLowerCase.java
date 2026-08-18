package com.logicbuilding;

public class UpperCaseToLowerCase {

	public static void main(String[] args) {
		String name = "ABdUL";
		StringBuilder sb = new StringBuilder();
		for (char c:name.toCharArray()) {
			if(c >='A' && c<='Z') {
				sb.append((char) (c+32));
			}else {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());

	}

}
