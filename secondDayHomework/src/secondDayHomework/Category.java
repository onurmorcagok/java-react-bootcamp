package secondDayHomework;

public class Category {
	int categoryId;
	String categoryName;
	String categoryDescription;
	double coursePay;
	
	public Category(int categoryId, String categoryName, String categoryDescription, double coursePay) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.coursePay = coursePay;
	}
}