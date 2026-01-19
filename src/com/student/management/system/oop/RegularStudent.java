package com.student.management.system.oop;

import java.io.Serializable;

public final class RegularStudent extends Student2 implements Serializable{
	private static final long serialVersionUID = 1L;

	private RegularStudent(StudentBuilder studentBuilder) {
		super(studentBuilder);
		percentage = calculatePercentage();
		grade = calculateGrade();
	}
	
	@Override
	public double calculatePercentage() {
		return totalMarksObtained/3.0;
	}
	
	public static class RegularStudentBuilder extends StudentBuilder{
		public RegularStudentBuilder(String name, int age, String contactNumber, String address) {
			super(name, age, contactNumber, address);
		}
		
		@Override
		public Student2 build() {
			Student2 s1 = new RegularStudent(this);
			return s1;
		}
	}
	
}
