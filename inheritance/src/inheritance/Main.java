package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer onur = new IndividualCustomer();
		onur.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "67890";
		
		UnionCustomer union = new UnionCustomer();
		union.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {onur, union, hepsiBurada};
		
		customerManager.multipleAdd(customers);
		

	}

}
