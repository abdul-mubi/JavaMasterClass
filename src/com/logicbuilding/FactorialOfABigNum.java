package com.logicbuilding;

import java.math.BigInteger;

public class FactorialOfABigNum {

	public static void main(String[] args) {
		int number = 50;
		BigInteger factorialNumber = BigInteger.ONE;// factorial of 0 is 1, thats why declaring this var with 1
		for (int i=1; i<=number; i++) {
			factorialNumber = factorialNumber.multiply(BigInteger.valueOf(i));
		}
		System.out.println(factorialNumber);
	}

}
