package com.student.management.system.oop;

public final class Teacher extends Person {
	private String employeeID;
	private String teacherSubject;
	private int teacherExperience;
	private int teacherSalary;
	private static final int BASE_SALARY = 30000;
	private static final int EXPERIENCE_INCREMENT = 2000;
	private static int totalTeacherCount;

	public Teacher(String teacherName, int teacherAge, String teacherContactNumber, String teacherAddress,
			String employeeID, String teacherSubject, int teacherExperience) {
		super(teacherName, teacherAge, teacherContactNumber, teacherAddress);
		if (validateEmployeeID(employeeID) && validateAge(teacherAge)) {
			this.employeeID = employeeID;
			this.teacherSubject = teacherSubject;
			this.teacherExperience = teacherExperience;
			teacherSalary = calculateSalary(teacherExperience);
			totalTeacherCount++;
		}
	}

	public int getTotalTeacherCount() {
		return totalTeacherCount;
	}
	
	private int calculateSalary(int teacherExperience) {
		return BASE_SALARY + (EXPERIENCE_INCREMENT * 2000);
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 21 && age <= 65) {
			this.age = age;
		} else {
			System.err.println("Provide age of range from 4 to 16");
		}
	}
	
	public boolean validateAge(int age) {
		if (age >= 21 && age <= 65) {
			return true;
		} else {
			System.err.println("Provide age of range from 4 to 16");
			return false;
		}
	}

	public String getEmployeeID() {
		return employeeID;
	}

	private boolean validateEmployeeID(String employeeID) {
		if (employeeID.startsWith("T") && employeeID.length() == 4) {
			return true;
		} else {
			System.err.println("Provide proper Employee ID");
			return false;
		}
	}

	public String getTeacherSubject() {
		return teacherSubject;
	}

	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}

	public int getTeacherExperience() {
		return teacherExperience;
	}

	public void setTeacherExperience(int teacherExperience) {
		this.teacherExperience = teacherExperience;
	}

	public int getTeacherSalary() {
		return teacherSalary;
	}

	public boolean updateInformation(String contactNumber, String address) {
		System.out.println("Requesting HR's approval");
		if (hrApproval()) {
			System.out.println("HR Approved");
			super.updateInformation(contactNumber, address);
			return true;
		}
		return false;
	}

	private boolean hrApproval() {
		return true;
	}
	
	public boolean updateInformation(String contactNumber) {
		System.out.println("Requesting HR's approval");
		if (hrApproval()) {
			System.out.println("HR Approved");
			super.updateInformation(contactNumber);
			return true;
		}
		return false;
	}

	public void displayTeacherInfo() {
		System.out.println("-----------Teacher given details-----------");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("teacherContactNumber: " + contactNumber);
		System.out.println("teacherAddress: " + address);
		System.out.println("employeeID: " + employeeID);
		System.out.println("teacherSubject: " + teacherSubject);
		System.out.println("teacherExperience: " + teacherExperience);
		System.out.println("-----------Teacher calculated details-----------");
		System.out.println("teacherSalary: " + teacherSalary);
		System.out.println("========End========");

	}

	@Override
	public String toString() {
		return "Teacher [employeeID=" + employeeID + ", teacherSubject=" + teacherSubject + ", teacherExperience="
				+ teacherExperience + ", teacherSalary=" + teacherSalary + "]";
	}

}
