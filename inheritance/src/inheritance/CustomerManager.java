package inheritance;

public class CustomerManager {
	
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " Customer Number saved successfully.");
	}
	
	public void multipleAdd(Customer[] customers) {
		
		for (Customer customer : customers) {
			add(customer);
		}
	}

}
