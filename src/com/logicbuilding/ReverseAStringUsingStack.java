package com.logicbuilding;

import java.util.Stack;

public class ReverseAStringUsingStack {

	public static void main(String[] args) {
		String name = "Abdul";
		char[] charName = name.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		Stack<Character> stack = new Stack<Character>();
		for(char indiChar: charName) {
			stack.push(indiChar);
		}

		System.out.println(sb);
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb);
	}

}
