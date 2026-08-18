package com.logicbuilding;

public class PatternPrinting1 {

	public static void main(String[] args) {
		int limit = 5;
		for (int i = 1; i<=limit; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		for (int i = 1; i<=limit; i++) {
			for(int j =0; j<i; j++) {
				System.out.print((char) ('a'+j));
			}
			System.out.println("");
		}

	}

}
