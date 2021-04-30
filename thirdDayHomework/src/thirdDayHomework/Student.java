package thirdDayHomework;

public class Student extends User {
	
	private int examPoint;
	
	public Student() {}


	public Student(int id, String firstName, String lastName, String nationalIdentity, String userName, String password,
			int examPoint) {
		super(id, firstName, lastName, nationalIdentity, userName, password);
		this.examPoint = examPoint;
	}

	public int getExamPoint() {
		return examPoint;
	}

	public void setExamPoint(int examPoint) {
		this.examPoint = examPoint;
	}

}
