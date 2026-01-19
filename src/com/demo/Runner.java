package com.demo;

public class Runner {
	int a;

	public static void main(String[] args) {
		Person p1 = new Person("Abdul", 50);
		
		System.out.println(p1.getName());
		System.out.println(p1.getId());
		
		
		
//		Person p2 = new Person("Mubi", 100);
//		System.out.println(p2.getName());
//		System.out.println(p2.getId());
		
		Person p3 = new Person(p1);
//		
//		System.out.println(p3.getName());
//		System.out.println(p3.getId());
//		
		System.out.println(p1.equals(p3));
		System.out.println(p1.hashCode());
		System.out.println(p3.hashCode());
//		System.out.println(p1.getClass());
//		Person p2 = new Person("Abdul", 50);
//		System.out.println(p1.equals(p2));
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
		
		
		
		
		

	}
	
	public static void method1() {
		int a = 10;
		int b = a;
		System.out.println(b);
	}

}
