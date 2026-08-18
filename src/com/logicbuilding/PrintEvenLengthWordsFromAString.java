package com.logicbuilding;

public class PrintEvenLengthWordsFromAString {

	public static void main(String[] args) {
		String input = "Sky is blue and vast";
		String[] inputArr = input.split(" ");
		for (String in:inputArr) {
			if (in.length() % 2 == 0) {
				System.out.println(in);
			}
		}

	}

}
