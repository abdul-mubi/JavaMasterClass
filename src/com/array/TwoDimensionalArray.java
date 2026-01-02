package com.array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
//		interviewQuestion();
		int a[][] = new int[5][3];
		for (int rowIndex = 0; rowIndex<a.length; rowIndex++) {
			for (int colIndex = 0; colIndex < a[rowIndex].length; colIndex++) {
//				System.out.print(rowIndex + " "+colIndex);
				System.out.print(a[rowIndex][colIndex]+ " ");
			}
			System.out.println("");
		}

	}
	
	static void interviewQuestion() {
		// *
		// **
		// ***
		// ****
		
		for (int rowIndex = 0; rowIndex < 4; rowIndex++) {
			String result = "";
			for (int colIndex = 0; colIndex <= rowIndex; colIndex++ ) {
				result += "*";
			}
			System.out.println(result);
		}
	}

}
