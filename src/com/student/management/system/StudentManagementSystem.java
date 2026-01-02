package com.student.management.system;

import java.util.Scanner;

public class StudentManagementSystem {
	public static Scanner scanner = new Scanner(System.in);
	public static String studentName[] = new String[100];
	public static int studentRollNumber[] = new int[100];
	public static double mathsMark[] = new double[100];
	public static double scienceMark[] = new double[100];
	public static double englishMark[] = new double[100];
	public static String grade[] = new String[100];
	public static int age[] = new int[100];
	public static int index = 0;

	public static void main(String[] args) {
		int option;

		System.out.println("Student Management System");
		while (true) {
			System.out.println("Type any one number from 1-4");
			System.out.println("1. Add new Student");
			System.out.println("2. See Details of one Student");
			System.out.println("3. See Details of all Student");
			System.out.println("4. Exist from the App");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				System.out.println("Adding Students");
				addStudentDetails();
				break;
			case 2:
				System.out.println("Type index to see details");
				int i = scanner.nextInt();
				System.out.println("Student name = "+studentName[i]);
				System.out.println("studentRollNumber = "+studentRollNumber[i]);
				System.out.println("mathsMark = "+mathsMark[i]);
				System.out.println("scienceMark = "+scienceMark[i]);
				System.out.println("englishMark = "+englishMark[i]);
				System.out.println("age = "+age[i]);
				System.out.println("grade = "+grade[i]);
				break;
			case 3:
				System.out.println("See Details of all Students");
				printAllStudentDetails();
				break;
			case 4:
				System.out.println("Exit from the App...");
				System.exit(0);
			}
		}
	}

	private static void printAllStudentDetails() {
		for (int i = 0; i<index; i++) {
			System.out.println("Student name = "+studentName[i]);
			System.out.println("studentRollNumber = "+studentRollNumber[i]);
			System.out.println("mathsMark = "+mathsMark[i]);
			System.out.println("scienceMark = "+scienceMark[i]);
			System.out.println("englishMark = "+englishMark[i]);
			System.out.println("age = "+age[i]);
			System.out.println("grade = "+grade[i]);
			System.out.println("===============================================");
		}
		
	}

	public static void addStudentDetails() {
		System.out.println("Enter student name");
		studentName[index] = scanner.next();

		System.out.println("Enter student roll number");
		studentRollNumber[index] = scanner.nextInt();

		System.out.println("Enter student age");
		age[index] = scanner.nextInt();

		System.out.println("Enter student mathsMark");
		mathsMark[index] = scanner.nextInt();

		System.out.println("Enter student scienceMark");
		scienceMark[index] = scanner.nextInt();

		System.out.println("Enter student englishMark");
		englishMark[index] = scanner.nextInt();
		
		grade[index] = gradeCalculator(mathsMark[index], scienceMark[index], englishMark[index]);
		
		index++;
	}

	private static String gradeCalculator(double mathsMark, double scienceMark, double englishMark) {
		double percentage = (mathsMark+scienceMark+englishMark)/3.0;
		String grade;
		if (percentage>=90 ) {
			grade = "A+";
		}else if (percentage <90 && percentage>=80) {
			grade = "B+";
		}else if (percentage <80 && percentage>=70) {
			grade = "C+";
		}else if (percentage <70 && percentage>=60) {
			grade = "D+";
		}else if (percentage <60 && percentage>=50) {
			grade = "E+";
		}else {
			grade = "F";
		}
		return grade;
	}
}
