package gün4Odev2;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database : " + customer.getFirstName());
		
	}

}
