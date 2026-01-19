package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add("Abdul");
		list.add(true);
		
		
		int x = (Integer) list.get(0);
		System.out.println(x);
		
		String y = (String)list.get(1);
		System.out.println(y);
		
		boolean z = (Boolean)list.get(2);
		System.out.println(z);
		
	}

}
