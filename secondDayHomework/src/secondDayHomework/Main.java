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
		
		Category category1 = new Category(101, "Java - React.js Bootcamp",
				"Java and React Fullstack Software Developer Trainer Camp", 0);
		
		Category category2 = new Category(102, ".Net - Angular.js Bootcamp",
				".Net and Angular Fullstack Software Developer Trainer Camp", 0);
		
		System.out.println(" ");
		
		Category[] categories = {category1, category2};
		
		System.out.println("Categories");
		System.out.println("===============================");
		
		for(Category category : categories) {
			System.out.println(category.categoryDescription);
		}
		
		System.out.println(" ");
		System.out.println(" ");
		
		LecturerManager lecturerManager1 = new LecturerManager();
		lecturerManager1.lecturerInfo(lecturer1);
		
		System.out.println(" ");
		
		LecturerManager lecturerManager2 = new LecturerManager();
		lecturerManager2.lecturerInfo(lecturer2);
	}

}
