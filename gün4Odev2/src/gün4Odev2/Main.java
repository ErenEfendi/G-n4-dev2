package gün4Odev2;

public class Main {

	public static void main(String[] args) {
		
		//BaseCustomerManager customerManager = new StarBucksCustomerManager(new MernisServiceAdapter());
		CustomerManager customerManager = new CustomerManager();
		Customer customer1 = new Customer(1,"Erencan","Bilge","26/10/2002","10000000000" );
		customerManager.save(customer1);

	}

}
