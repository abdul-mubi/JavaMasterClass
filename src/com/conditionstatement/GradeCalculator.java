package com.conditionstatement;

public class GradeCalculator {//Example of if - else if

	public static void main(String[] args) {
		float percentage = 39.0f;
		char grade;
		
		if (percentage >= 90) {
			grade = 'A';
		}else if (percentage < 90 && percentage >= 60) {
			grade = 'B';
		}else if (percentage < 60 && percentage>= 40) {
			grade = 'C';
		}else {
			grade = 'F';
		}
		System.out.println("Grade is "+grade);

	}

}
