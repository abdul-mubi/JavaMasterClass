package com.student.management.system.oop;

import java.io.Serializable;
import java.util.Objects;

import com.student.management.system.exceptions.InvalidAgeException;

public abstract class Student2 extends Person implements Serializable{
	private static final long serialVersionUID = 1L;
	private final int rollNumber;
	private final double marksObtainedInEnglish;
	private final double marksObtainedInMaths;
	private final double marksObtainedInScience;
	protected String grade;
	protected double percentage;
	protected final double totalMarksObtained;
	private static int totalStudentCount;

	protected Student2(StudentBuilder studentBuilder) {
		super(studentBuilder.name, studentBuilder.age, studentBuilder.contactNumber, studentBuilder.address);
		this.rollNumber = studentBuilder.rollNumber;
		this.marksObtainedInEnglish = studentBuilder.marksObtainedInEnglish;
		this.marksObtainedInMaths = studentBuilder.marksObtainedInMaths;
		this.marksObtainedInScience = studentBuilder.marksObtainedInScience;
		totalMarksObtained = calculateTotalMarks();
		totalStudentCount++;
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

	public int getRollNumber() {
		return rollNumber;
	}

	

	public double getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}

	

	public double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public String getGrade() {
		return grade;
	}

	public double calculateTotalMarks() {
		return marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
	}

	public abstract double calculatePercentage();

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
		return "Student2 [rollNumber=" + rollNumber + ", marksObtainedInEnglish=" + marksObtainedInEnglish
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
		Student2 other = (Student2) obj;
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

	public abstract static class StudentBuilder {
		// Optional
		private int rollNumber;
		private double marksObtainedInEnglish;
		private double marksObtainedInMaths;
		private double marksObtainedInScience;
		// Mandatory
		private String name;
		private int age;
		private String contactNumber;
		private String address;

		public StudentBuilder(String name, int age, String contactNumber, String address) {
			if (validateName(name) && validateAge(age) && validateContactNumber(contactNumber)
					&& validateAddress(address)) {
				this.name = name;
				this.age = age;
				this.contactNumber = contactNumber;
				this.address = address;
			}
		}

		public StudentBuilder withRollNumber(int rollNumber) {
			if (validateRollNumber(rollNumber)) {
				this.rollNumber = rollNumber;
				return this;
			}
			return null;
		}

		public StudentBuilder withMarksObtainedInEnglish(double marksObtainedInEnglish) {
			if (validateMarksObtained(marksObtainedInEnglish)) {
				this.marksObtainedInEnglish = marksObtainedInEnglish;
				return this;
			}
			return null;
		}

		public StudentBuilder withMarksObtainedInMaths(double marksObtainedInMaths) {
			
			if (validateMarksObtained(marksObtainedInMaths)) {
				this.marksObtainedInMaths = marksObtainedInMaths;
				return this;
			}
			return null;
		}

		public StudentBuilder withMarksObtainedInScience(double marksObtainedInScience) {
			if (validateMarksObtained(marksObtainedInScience)) {
				this.marksObtainedInScience = marksObtainedInScience;
				return this;
			}
			return null;
		}

		public abstract Student2 build();

		private boolean validateAge(int age) {
			if (age >= 4 && age <= 16) {
				return true;
			} else {
				try {
					throw new InvalidAgeException("Age should be within the limit from 4 to 16");
				}catch(InvalidAgeException e) {
					System.err.println(e.getMessage());
					e.printStackTrace();
				}
				return false;
			}
		}

		private boolean validateName(String name) {
			boolean digitNotFound = true;
			for (int i = 0; i < name.length(); i++) {
				if (Character.isDigit(name.charAt(i))) {
					digitNotFound = false;
					break;
				}
			}
			return digitNotFound;
		}

		private boolean validateContactNumber(String contactNumber) {
			if (contactNumber.matches("\\d{10}")) {
				return true;
			} else {
				System.err.println("Provide 10 digit contact number");
				return false;
			}
		}

		private boolean validateAddress(String studentAddress) {
			if (studentAddress.isEmpty()) {
				System.err.println("Provide some address value as it is mandatory");
				return false;
			} else {
				return true;
			}

		}
		
		private boolean validateRollNumber(int rollNumber) {
			if (rollNumber > 0) {
				return true;
			} else {
				System.err.println("Provide some rollnumber greater than 0 ");
				return false;
			}
		}
		
		private boolean validateMarksObtained(double marksObtained) {
			if (marksObtained >= 0 && marksObtained <= 100) {
				return true;
			} else {
				System.err.println("Provide proper marks");
				return false;
			}
		}
	}

}
