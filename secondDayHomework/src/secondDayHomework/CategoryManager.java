package secondDayHomework;

public class CategoryManager {
	
	public void addCategory(Category category, Lecturer lecturer) {
		System.out.println(lecturer.lecturerName + "by added" + category.categoryName);
	} 
	
	public void updateCategory(Category category, Lecturer lecturer) {
		System.out.println(lecturer.lecturerName + "by updated" + category.categoryName);
	} 
	
	public void removedCategory(Category category, Lecturer lecturer) {
		System.out.println(lecturer.lecturerName + "by removed" + category.categoryName);
	} 

}
