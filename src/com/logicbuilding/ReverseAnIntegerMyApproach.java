package com.logicbuilding;

public class ReverseAnIntegerMyApproach {

	public static void main(String[] args) {
		int a = 120; // test inputs are 123, -123, 120
		String stringOut = a+"";
		String finalOut = "";
		
		for (int i = stringOut.length()-1; i>=0; i--) {
			if(stringOut.charAt(i) != '-' && stringOut.charAt(i) != '0') {
				finalOut = finalOut + stringOut.charAt(i);
			}else if(stringOut.charAt(i) == '-') {
				finalOut = stringOut.charAt(i)+finalOut ;
			}
			
		}
		System.out.println(finalOut);
	}

}
