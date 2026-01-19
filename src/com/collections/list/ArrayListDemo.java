package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		System.out.println(al);
		al.set(1, 20);
		al.set(2, 30);
		al.set(3, 40);
		al.set(4, 50);
		System.out.println(al);
		
		al.add(1,60);
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al);
		System.out.println(al.size());
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
		
		System.out.println(al.indexOf(70));
		

	}

}
