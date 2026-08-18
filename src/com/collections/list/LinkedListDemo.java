package com.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> nameList = new LinkedList<String>();
		nameList.add("Abdul");
		nameList.add("Mubi");
		nameList.add("Rayan");
		
		for (int i =0; i< nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
		
		for (String name:nameList) {
			System.out.println(name);
		}
		
		Iterator<String> itName = nameList.iterator();
		while(itName.hasNext()) {
			System.out.println(itName.next());
		}
		
		nameList.forEach(System.out::println);
		itName.forEachRemaining(System.out::println);

	}

}
