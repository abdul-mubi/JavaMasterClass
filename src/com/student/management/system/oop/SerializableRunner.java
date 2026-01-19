package com.student.management.system.oop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableRunner {

	public static void main(String[] args) {
		String fileName = "Students.ser";
		File myFile = new File(fileName);

		if (myFile.exists()) {
			System.out.println("Serialized file found... Loading student information");
			Student2 students[] = deserializeStudents(fileName);
			for (Student2 student : students) {
				System.out.println(student);
			}
		} else {
			System.out.println("Students.ser file is not avialble, creating new file");
			Student2[] students = createStudentArray();
			serializeStudent(students, fileName);

		}

	}

	private static void serializeStudent(Student2[] students, String fileName) {
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(students);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static Student2[] createStudentArray() {
		Student2 studentArray[] = new Student2[3];
		studentArray[0] = new RegularStudent.RegularStudentBuilder("Abdul", 4, "7502060003", "Thanjavur")
				.withMarksObtainedInEnglish(10).withMarksObtainedInMaths(100).withMarksObtainedInScience(100).build();
		studentArray[1] = new RegularStudent.RegularStudentBuilder("Mubi", 4, "9980251826", "Palakkad")
				.withMarksObtainedInEnglish(20).withMarksObtainedInMaths(100).withMarksObtainedInScience(100).build();
		studentArray[2] = new SportStudent.SportStudentBuilder("Rayan", 4, "8529636547", "Bangalore")
				.withSportScore(100).withMarksObtainedInEnglish(100).withMarksObtainedInMaths(100)
				.withMarksObtainedInScience(30).build();
		return studentArray;
	}

	private static Student2[] deserializeStudents(String fileName) {
		try (FileInputStream fis = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(fis)) {
			Student2[] students = (Student2[]) ois.readObject();
			return students;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
