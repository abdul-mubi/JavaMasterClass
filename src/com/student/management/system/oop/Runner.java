package com.student.management.system.oop;


public class Runner {

	public static void main(String[] args) {
			Student2 s1 = new RegularStudent.RegularStudentBuilder("Abdul", 3,"7502060003" ,"Thanjavur")
					.withMarksObtainedInEnglish(100)
					.withMarksObtainedInMaths(100)
					.withMarksObtainedInScience(100)
					.build();
			s1.displayStudentInfo();
		
	
		Student2 s2 = new SportStudent.SportStudentBuilder("Rayan", 4, "8529636547", "Bangalore").withSportScore(100)
				.withMarksObtainedInEnglish(100).withMarksObtainedInMaths(100).withMarksObtainedInScience(100).build();
		s2.displayStudentInfo();
		

	}

}
