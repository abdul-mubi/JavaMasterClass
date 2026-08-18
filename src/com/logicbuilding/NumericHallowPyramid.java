package com.logicbuilding;

public class NumericHallowPyramid {

	public static void main(String[] args) {
		int limit =10;
		for(int row = 1; row<=limit; row++) {
			for(int col = 1; col<=row; col++) {
				if(row == limit || col == 1 || col == row) {
					System.out.print(col);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
