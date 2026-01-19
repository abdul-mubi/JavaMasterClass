package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteration {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		//Simple for loop
		for (int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//For-each loop
		for(Integer number : al) {
			System.out.println(number);
		}
		
		//Using iterator with hasNext and next methods
		Iterator<Integer> iteratorValue=al.iterator();
		while(iteratorValue.hasNext()) {
			System.out.println(iteratorValue.next());
		}
		//Using iterator with forEachRemaining method
		iteratorValue.forEachRemaining(number -> System.out.println(number));
		iteratorValue.forEachRemaining(System.out::println);
		
		
		//Using forEach method from Iterable
		al.forEach(number -> System.out.println(number));
		al.forEach(System.out::println);
		
		
		
		
		
		

	}

}
