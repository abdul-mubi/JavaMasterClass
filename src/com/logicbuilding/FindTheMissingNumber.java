package com.logicbuilding;

public class FindTheMissingNumber {

	public static void main(String[] args) {
		int a[] = {585,586,587,589,590,591};
		int first_number = a[0];
		int missing_number = first_number;
		for (int i=0; i<=a.length-1;i++) {
			if (a[i] == missing_number) {
				missing_number++;
				System.out.println(missing_number);
			}else {
				break;
			}
		}
		System.out.println("Missing number is "+missing_number);

	}

}
