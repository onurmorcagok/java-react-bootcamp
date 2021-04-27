package secondDayHomework;

public class Main {

	public static void main(String[] args) {
		
		Lecturer lecturer1 = new Lecturer();
		
		lecturer1.lecturerName = "Engin DEMIROG";
		lecturer1.lecturerTitle = "Software Trainer";
		lecturer1.lecturerLessons = "Java, C#";
		
		Lecturer lecturer2 = new Lecturer();
		
		lecturer2.lecturerName = "Onur MORCAGOK";
		lecturer2.lecturerTitle = "Frontend Developer";
		lecturer2.lecturerLessons = "React, Vue and Angular";
		
		Lecturer[] lecturers = { lecturer1, lecturer2 };
		
		System.out.println("Lecturers");
		System.out.println("===============================");
		
		for (Lecturer lecturer : lecturers) {
			System.out.println(lecturer.lecturerName + " - " + lecturer.lecturerTitle);
		}
		
		
	}

}
