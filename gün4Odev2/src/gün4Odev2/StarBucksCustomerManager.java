package gün4Odev2;

public class StarBucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	
	public void StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to database: "+customer.getFirstName());
			
		}else {
			System.out.println("Not a valid person!");
		}
		
	}
}
