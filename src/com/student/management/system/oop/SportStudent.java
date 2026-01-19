package com.student.management.system.oop;

import java.io.Serializable;

public final class SportStudent extends Student2 implements Serializable{
	private static final long serialVersionUID = 1L;
	private double sportScore; 
	
	private SportStudent(StudentBuilder studentBuilder) {
		super(studentBuilder);
		this.sportScore = ((SportStudentBuilder)studentBuilder).sportScore;
		percentage = calculatePercentage();
		grade = calculateGrade();
	}
	

	@Override
	public double calculatePercentage() {
		double academicPercentage = totalMarksObtained/3.0;
		double finalPercentage = (academicPercentage*0.8) + (sportScore*0.2);
		return finalPercentage;
	}
	
	public static final class SportStudentBuilder extends StudentBuilder{
		private double sportScore; 

		public SportStudentBuilder(String name, int age, String contactNumber, String address) {
			super(name, age, contactNumber, address);
		}
		
		public SportStudentBuilder withSportScore(double sportScore) {
			if (sportScore>=0.0 && sportScore<=100.0) {
				this.sportScore = sportScore;
			}
			return this;
		}

		@Override
		public Student2 build() {
			Student2 s1 = new SportStudent(this);
			return s1;
		}
	}

}
