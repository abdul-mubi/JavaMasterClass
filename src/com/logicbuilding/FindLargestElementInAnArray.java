package com.logicbuilding;

public class FindLargestElementInAnArray {

	public static void main(String[] args) {
		int[] input = {10,100,490,200,90};
		
		int largestNumber = input[0];
		for(int i:input) {
			if (largestNumber< i) {
				largestNumber = i;
			}
		}
		System.out.println(largestNumber);

	}

}
