package com.collections.stackandqueue;

import java.util.ArrayDeque;

public class ArrayDequeAsQueue {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.offer(1);
		ad.offer(2);
		ad.offer(3);
		ad.offer(4);
		ad.offer(5);
		System.out.println(ad);
		ad.pop();
		System.out.println(ad);

	}

}
