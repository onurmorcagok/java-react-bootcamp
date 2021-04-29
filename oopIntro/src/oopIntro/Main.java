package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Lenovo Laptop");
		product1.setUnitPrice(14000);
		product1.setDetail("16GB Ram, 256GB SSD");
		product1.setDiscount(10);
		
		Product product2 = new Product(2, "Microsoft Keyboard", 400, "Magic Keyboard Black", 4);
		
		Product[] products = {product1, product2};
		
		for(Product product : products) {
			System.out.println(product.getName());
		}
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		System.out.println("Discounted Price: " + product1.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setCategoryName("Computer");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setCategoryName("Electronic");
		
		Category[] categories = {category1, category2};
		
		for(Category category : categories) {
			System.out.println("Category: " + category.getCategoryName());
		}

	}

}
