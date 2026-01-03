package com.student.management.system.oop;

public class Student {
	private String name;
	private int rollNumber;
	private int age;
	private double marksObtainedInEnglish;
	private double marksObtainedInMaths;
	private double marksObtainedInScience;
	private String grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.isEmpty() && !validateGivenStringVal(name)) {
			this.name = name;
		} else {
			System.out.println("It is an invalid name, Please provide name with only characters");
		}

	}

	private boolean validateGivenStringVal(String name) {
		boolean digit = false;
		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i))) {
				digit = true;
				break;
			}
		}
		return digit;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if (rollNumber > 0) {
			this.rollNumber = rollNumber;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 4 && age <= 16) {
			this.age = age;
		}
	}

	public double getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}

	public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
		if (marksObtainedInEnglish >= 0 && marksObtainedInEnglish <= 100) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
		}
	}

	public double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public void setMarksObtainedInMaths(double marksObtainedInMaths) {
		if (marksObtainedInMaths >= 0 && marksObtainedInMaths <= 100) {
			this.marksObtainedInMaths = marksObtainedInMaths;
		}
	}

	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public void setMarksObtainedInScience(double marksObtainedInScience) {
		if (marksObtainedInScience >= 0 && marksObtainedInScience <= 100) {
			this.marksObtainedInScience = marksObtainedInScience;
		}
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		if (!grade.isEmpty() && !validateGivenStringVal(grade)) {
			this.grade = grade;
		}
	}

	public void calculateTotalMarks() {
		System.out.println(marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience);
	}

}
