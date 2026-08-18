package com.student.management.system.oop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListWithSerializableRunner {

	public static void main(String[] args) {
		String fileName = "Students.ser";
		File myFile = new File(fileName);
		List<Student2> studentList = new ArrayList<Student2>();
		Scanner scanner = new Scanner(System.in);

		if (myFile.exists()) {
			System.out.println("Serialized file found... Loading student information");
			List<Student2> retrievedStudents = deserializeStudents(fileName);
			for (Student2 student : retrievedStudents) {
				System.out.println(student);
			}
			System.out.println("Do you want to add more students (true/false)");
			boolean addStudent = scanner.nextBoolean();
			scanner.nextLine();
			if (addStudent){
				studentList = addStudent(addStudent, scanner, studentList);
				serializeStudent(studentList, fileName);
				System.out.println("new .ser file created...");
			}
			
		} else {
			System.out.println("Students.ser file is not avialble, creating new file");
			
			System.out.println("Started adding student....");
			System.out.println("Do you want to continue (true/false)");
			boolean addStudent = scanner.nextBoolean();
			scanner.nextLine();
			studentList = addStudent(addStudent, scanner, studentList);
			serializeStudent(studentList, fileName);
			System.out.println(".ser file created...");
		}
		scanner.close();
	}
	
	private static List<Student2> addStudent(boolean addStudent, Scanner scanner, List<Student2> studentList) {
		while(addStudent) {
			System.out.println("Enter student name...");
			String studentName = scanner.nextLine();
			
			System.out.println("Enter student age...");
			int studentAge = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Enter student Phone Number...");
			String studentNumber = scanner.nextLine();
			
			System.out.println("Enter student City...");
			String studentCity = scanner.nextLine();
			
			System.out.println("Enter Marks in English...");
			int engMark = scanner.nextInt();
			
			System.out.println("Enter Marks in Maths...");
			int mathsMark = scanner.nextInt();
			
			System.out.println("Enter Marks in Science...");
			int scienceMark = scanner.nextInt();
			
			System.out.println("Is this student a sport student? (true/false)");
			boolean sportStudent = scanner.nextBoolean();
			
			if(sportStudent) {
				System.out.println("Enter student Sports...");
				int sportsScore = scanner.nextInt();
				
				Student2 ss = new SportStudent.SportStudentBuilder(studentName, studentAge, studentNumber, studentCity)
						.withSportScore(sportsScore).withMarksObtainedInEnglish(engMark).withMarksObtainedInMaths(mathsMark)
						.withMarksObtainedInScience(scienceMark).build();
				studentList.add(ss);
			}else {
				Student2 rs = new RegularStudent.RegularStudentBuilder(studentName, studentAge, studentNumber, studentCity)
						.withMarksObtainedInEnglish(engMark).withMarksObtainedInMaths(mathsMark)
						.withMarksObtainedInScience(scienceMark).build();
				studentList.add(rs);
			}
			System.out.println("Do you want to continue (true/false)");
			addStudent = scanner.nextBoolean();
			scanner.nextLine();
		}
		return studentList;
	}

	private static void serializeStudent(List<Student2> newStudents, String fileName) {
		List<Student2> existingStudents = deserializeStudents(fileName);
		existingStudents.addAll(newStudents);
		
		
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(existingStudents);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	@SuppressWarnings("unchecked")
	private static List<Student2> deserializeStudents(String fileName) {
		try (FileInputStream fis = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(fis)) {
			return (List<Student2>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("My be file not found.... Creating new file");
		}
		return new ArrayList<Student2>();
	}

}
