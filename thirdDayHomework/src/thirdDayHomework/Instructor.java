package thirdDayHomework;

public class Instructor extends User {
	
	private String certification;
	
	public Instructor() {}


	public Instructor(int id, String firstName, String lastName, String nationalIdentity, String userName,
			String password, String certification) {
		super(id, firstName, lastName, nationalIdentity, userName, password);
		this.certification = certification;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

}
