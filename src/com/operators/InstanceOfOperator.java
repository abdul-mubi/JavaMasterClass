package com.operators;

public class InstanceOfOperator {

	public static void main(String[] args) {
		String name = "Abdul";
		String isString = name instanceof String ? "Yes" : "No" ; //instanceof operator should be used only for referenced datatype
		System.out.println(isString);

	}

}
