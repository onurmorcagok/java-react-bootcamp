package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.id = 1;
		product1.productName = "Kalem";
		product1.unitPrice = 1000;
		product1.productDescription = "Güzel bir kalem";
		
		Product product2 = new Product();
		product2.id = 2;
		product2.productName = "Silgi";
		product2.unitPrice = 500;
		product2.productDescription = "Silgi güzel deðil ama idare eder";
		
		Product product3 = new Product();
		product3.id = 3;
		product3.productName = "Defter";
		product3.unitPrice = 750;
		product3.productDescription = "Dört ortalý kareli defter";
		
		
		Product[] products = {product1, product2, product3};


		for(Product product : products) {
			System.out.println(product.productName);
		}
		
		ProductManager productManager = new ProductManager();
		
		productManager.ProductManagerAdd(product1);
		
		Product product4 = new Product(4, "Tahta Kalemi", 450, "T Cetvel");
		
		System.out.println(product4.productName);
	}

}
