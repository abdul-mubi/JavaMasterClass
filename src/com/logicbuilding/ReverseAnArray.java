package com.logicbuilding;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {10,20,30,40};
		int [] output = new int[input.length];
		
		int index = 0;
		for(int i=input.length-1; i>=0;i--) {
			output[index] = input[i];
			index++;
		}
		System.out.println(Arrays.toString(output));

	}

}
