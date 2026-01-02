package com.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Abdul");
		
		System.out.println(sb.length());
		int capacity = sb.capacity();
		System.out.println(capacity); //16 + 5 = 21
		
		sb.append("i am the danger of this city, because i am bad man");
		System.out.println(sb.length());
		int capacityNew = sb.capacity();
		System.out.println(capacityNew); // here also 55+16 should add but why it is not added 
	}

}
