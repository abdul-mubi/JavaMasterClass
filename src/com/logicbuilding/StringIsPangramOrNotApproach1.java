package com.logicbuilding;

public class StringIsPangramOrNotApproach1 {

	public static void main(String[] args) {
		String sentense = "The quick brown fox jumps over the lazy og";
		sentense = sentense.toLowerCase();
		boolean flag = true;
		if(sentense.length() < 26) {
			flag = false;
		}
		for(char index='a'; index<='z'; index++) {
			if (sentense.indexOf(index) == -1) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("Given String is a Pangram");
		else
			System.out.println("Given string is not a Pangram");

	}

}
