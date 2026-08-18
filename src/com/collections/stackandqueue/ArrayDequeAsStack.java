package com.collections.stackandqueue;

import java.util.ArrayDeque;

public class ArrayDequeAsStack {

	public static void main(String[] args) {
		ArrayDeque<String> ad = new ArrayDeque<String>();
		ad.push("Abdul");
		ad.push("Mubi");
		System.out.println(ad);
		System.out.println(ad.peek());
		
		System.out.println(ad.pop());
		System.out.println(ad.isEmpty());
		

	}

}
