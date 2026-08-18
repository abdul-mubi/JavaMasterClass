package com.logicbuilding;

public class LowerCaseToUpperCase {

	public static void main(String[] args) {
		String name = "abDul";
		StringBuilder sb = new StringBuilder();
		for(char c:name.toCharArray()) {
			if(c >= 'a' && c<='z') {
				sb.append((char) (c-32));
			}else {
				sb.append(c);
			}
		}
		
		System.out.println(sb);

	}

}
