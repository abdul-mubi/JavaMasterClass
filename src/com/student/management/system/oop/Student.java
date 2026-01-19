package com.student.management.system.oop;

import java.util.Objects;

public class Student extends Person {

	private int rollNumber;
	private double marksObtainedInEnglish;
	private double marksObtainedInMaths;
	private double marksObtainedInScience;
	private String grade;
	private double percentage;
	private double totalMarksObtained;
	private static int totalStudentCount;

	public Student(String name, int rollNumber, int age, double marksObtainedInEnglish, double marksObtainedInMaths,
			double marksObtainedInScience, String contactNumber, String studentAddress) {
		super(name, age, contactNumber, studentAddress);

		if (validateAge(age) && validateRollNumber(rollNumber) && validateMarksObtained(marksObtainedInEnglish)
				&& validateMarksObtained(marksObtainedInMaths) && validateMarksObtained(marksObtainedInScience)) {
			this.rollNumber = rollNumber;
			this.marksObtainedInEnglish = marksObtainedInEnglish;
			this.marksObtainedInMaths = marksObtainedInMaths;
			this.marksObtainedInScience = marksObtainedInScience;
			totalMarksObtained = calculateTotalMarks();
			percentage = calculatePercentage();
			grade = calculateGrade();
			totalStudentCount++;
		}
	}
	
	public int getTotalStudentCount() {
		return totalStudentCount;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 4 && age <= 16) {
			this.age = age;
		} else {
			System.err.println("Provide age of range from 4 to 16");
		}
	}
	
	public boolean validateAge(int age) {
		if (age >= 4 && age <= 16) {
			return true;
		} else {
			System.err.println("Provide age of range from 4 to 16");
			return false;
		}
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if (rollNumber > 0) {
			this.rollNumber = rollNumber;
		} else {
			System.err.println("Prove some rollnumber greater than 0 ");
		}
	}

	public boolean validateRollNumber(int rollNumber) {
		if (rollNumber > 0) {
			return true;
		} else {
			System.err.println("Prove some rollnumber greater than 0 ");
			return false;
		}
	}

	public double getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}

	public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
		if (marksObtainedInEnglish >= 0 && marksObtainedInEnglish <= 100) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
		} else {
			System.err.println("Provide proper marks for English");
		}
	}

	public boolean validateMarksObtained(double marksObtained) {
		if (marksObtained >= 0 && marksObtained <= 100) {
			return true;
		} else {
			System.err.println("Provide proper marks");
			return false;
		}
	}

	public double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public void setMarksObtainedInMaths(double marksObtainedInMaths) {
		if (marksObtainedInMaths >= 0 && marksObtainedInMaths <= 100) {
			this.marksObtainedInMaths = marksObtainedInMaths;
		} else {
			System.err.println("Provide proper marks for Maths");
		}
	}

	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public void setMarksObtainedInScience(double marksObtainedInScience) {
		if (marksObtainedInScience >= 0 && marksObtainedInScience <= 100) {
			this.marksObtainedInScience = marksObtainedInScience;
		} else {
			System.err.println("Provide proper marks for Science");
		}
	}

	public String getGrade() {
		return grade;
	}

	public double calculateTotalMarks() {
		return marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
	}

	public double calculatePercentage() {
		return totalMarksObtained / 3.0;
	}

	public String calculateGrade() {
		return GradeCalculator.gradeCalculator(percentage);
	}

	public double getPercentage() {
		return percentage;
	}

	public double getTotalMarksObtained() {
		return totalMarksObtained;
	}
	
	public boolean updateInformation(String contactNumber, String address) {
		System.out.println("Requesting parent's approval");
		if (parentApproval()) {
			System.out.println("Parents Approved");
			super.updateInformation(contactNumber, address);
			return true;
		}
		return false;
	}
	
	private boolean parentApproval() {
		return true;
	}
	
	public boolean updateInformation(String contactNumber) {
		System.out.println("Requesting parent's approval for contact updates");
		if (parentApproval()) {
			System.out.println("Parents Approved for contact updation");
			super.updateInformation(contactNumber);
			return true;
		}
		return false;
	}

	public void displayStudentInfo() {
		System.out.println("-----------Student given details-----------");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Contact Number: " + contactNumber);
		System.out.println("Student Address: " + address);
		System.out.println("RollNumber: " + rollNumber);
		System.out.println("English marks: " + marksObtainedInEnglish);
		System.out.println("Maths marks: " + marksObtainedInMaths);
		System.out.println("Science marks: " + marksObtainedInScience);
		System.out.println("-----------Student calculated details-----------");
		System.out.println("totalMarksObtained: " + totalMarksObtained);
		System.out.println("percentage: " + percentage);
		System.out.println("grade: " + grade);
		System.out.println("========End========");

	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", marksObtainedInEnglish=" + marksObtainedInEnglish
				+ ", marksObtainedInMaths=" + marksObtainedInMaths + ", marksObtainedInScience="
				+ marksObtainedInScience + ", grade=" + grade + ", percentage=" + percentage + ", totalMarksObtained="
				+ totalMarksObtained + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(grade, marksObtainedInEnglish, marksObtainedInMaths,
				marksObtainedInScience, percentage, rollNumber, totalMarksObtained);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(grade, other.grade)
				&& Double.doubleToLongBits(marksObtainedInEnglish) == Double
						.doubleToLongBits(other.marksObtainedInEnglish)
				&& Double.doubleToLongBits(marksObtainedInMaths) == Double.doubleToLongBits(other.marksObtainedInMaths)
				&& Double.doubleToLongBits(marksObtainedInScience) == Double
						.doubleToLongBits(other.marksObtainedInScience)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& rollNumber == other.rollNumber
				&& Double.doubleToLongBits(totalMarksObtained) == Double.doubleToLongBits(other.totalMarksObtained);
	}

}
