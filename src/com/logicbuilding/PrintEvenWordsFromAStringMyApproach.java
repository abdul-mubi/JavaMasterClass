package com.logicbuilding;

public class PrintEvenWordsFromAStringMyApproach {

	public static void main(String[] args) {
		String name = "Abdul Mubi Rayan Mubi2 Abdul Mubi3";
		String[] nameArr = name.split(" ");
		for (int i=1; i<nameArr.length; i++) { 
			System.out.println(nameArr[i]);
			i++;
		}

	}

}
