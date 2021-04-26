package oopIntro;

public class Product {
	
	int id;
	String productName;
	double unitPrice;
	String productDescription;
	
	public Product() {
		System.out.println("Product execute");
	}
	
	public Product(int id, String productName, double unitPrice, String productDescription) {
		this();
		this.id = id;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.productDescription = productDescription;
	}
}
