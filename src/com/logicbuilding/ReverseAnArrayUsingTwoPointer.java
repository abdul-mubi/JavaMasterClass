package com.logicbuilding;

import java.util.Arrays;

public class ReverseAnArrayUsingTwoPointer {

	public static void main(String[] args) {
		int[] input = {10,20,30,40};
		int left = 0;
		int right = input.length-1;
		int temp = -1;
		
		while(right>left) {
			temp = input[right];
			input[right] = input[left];
			input[left] = temp;
			left++;
			right--;
		}
		
		System.out.println(Arrays.toString(input));

	}

}
