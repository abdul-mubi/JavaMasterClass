package com.collections.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> names = new Stack<String>();
		names.push("Abdul");
		names.push("Mubi");
		System.out.println(names);
		
		System.out.println(names.peek());
		
		System.out.println(names.pop());
		System.out.println(names.isEmpty());
		System.out.println(names.search("Abdul"));
		

	}

}
