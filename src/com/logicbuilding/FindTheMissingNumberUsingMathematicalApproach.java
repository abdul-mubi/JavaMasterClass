package com.logicbuilding;

public class FindTheMissingNumberUsingMathematicalApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,4,5,6};
		int lastNum = a[a.length-1];
		int totalSum = (lastNum * (lastNum+1))/2;
		int arraySum = 0;
		for (int i=0; i<a.length;i++) {
			arraySum = arraySum+a[i];
		}
		
		int missingNum = totalSum-arraySum;
		System.out.println(missingNum);

	}

}
