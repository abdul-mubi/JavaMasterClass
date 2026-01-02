package com.array;

public class HeapMemoryCheck {

	public static void main(String[] args) {
		int marks[];
		marks = new int[5]; //It is a reference variable
		System.out.println(marks);// it will print the memory address of array which got created inside heap memory 
		System.out.println(marks[0]); // it will print the default value of integer
		System.out.println(marks.length); // it will print the length of array
		System.out.println("------------------------------------------");
		for (int i = 0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		System.out.println("------------------------------------------");
		marks[0] = 10;
		for (int i = 0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		System.out.println(marks);
		System.out.println("-------------------Enhanced for loop-----------------------");
		for(int value: marks) {
			System.out.println(value);
		}
		System.out.println("------------------------------------------");
		int marks2[] = {};
		System.out.println(marks2);
		marks2[0] = 10;
		
	}

}
