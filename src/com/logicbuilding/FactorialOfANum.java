package com.logicbuilding;

public class FactorialOfANum {

	public static void main(String[] args) {
		int number = 50;
		long factorialNumber = 1;// factotial of 0 is 1, thats why declaring this var with 1
		for (int i=1; i<=number; i++) {
			factorialNumber = factorialNumber * i;
		}
		System.out.println(factorialNumber);
		
		System.out.println(FactorialOfANum.usingForLoop(10));
	}
	
	public static int usingForLoop(int number) {
		int result = 1;
		for(int i=number; i>0; i--) {
			result = result * i;
		}
		return result;
	}

}
