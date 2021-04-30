package thirdDayHomework;

public class UserManager {
	
	public void userSave(User user) {
		System.out.println(user.getFirstName() + " was succesfully saved.");
	}
	
	public void multipleSave(User[] users) {
		
		for(User user : users) {
			userSave(user);
		}
	}

}
