package thirdDayHomework;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setNationalIdentity("12345");
		instructor.setUserName("engindemirog");
		instructor.setPassword("99999");
		
		Student student = new Student(2, "Onur", "Morcagok", "98765", "onurmorcagok", "00000", 10);
		
		User[] users = {instructor, student};
		
		for(User user : users) {
			System.out.println(user.getFirstName() + " " + user.getLastName());
		}
		
		System.out.println(" ");
		
		UserManager userManager = new UserManager();
		
		User[] users2 = {instructor, student};
		
		userManager.multipleSave(users2);

	}

}
