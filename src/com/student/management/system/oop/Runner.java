package com.student.management.system.oop;

public class Runner {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Abdul");
		s1.setAge(4);
		s1.setGrade("A++");
		s1.setMarksObtainedInMaths(80);
		s1.setMarksObtainedInScience(80);
		s1.setMarksObtainedInEnglish(80);
		s1.setRollNumber(100);

		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getGrade());
		System.out.println(s1.getRollNumber());
		System.out.println(s1.getMarksObtainedInEnglish());
		System.out.println(s1.getMarksObtainedInScience());
		System.out.println(s1.getMarksObtainedInMaths());

	}

}
