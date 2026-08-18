package com.logicbuilding;

import java.util.Arrays;

public class MoveAllZerosToEnd {
	public static void main(String[] args) {
		int[] a = {10,0,243,243,23435,0,0,44,432,43,0};
		
		int pointer1 = 0;
		int pointer2 = 0;

		int temp;
		while(pointer2<a.length) {
			if(a[pointer2]!=0) {
				temp = a[pointer1];
				a[pointer1] = a[pointer2];
				a[pointer2] = temp;
				pointer1++;
			}
			pointer2++;
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
