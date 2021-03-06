package g?n4Odev2;

public class Customer implements Entity {
     
	 private int id;
	 private String firstName;
	 private String lastName;
	 private String dateTime;
	 private String nationalityId;
	
	 
	 public Customer(int id, String firstName, String lastName, String dateTime, String nationalityId) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateTime = dateTime;
		this.nationalityId = nationalityId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDateTime() {
		return dateTime;
	}


	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
     
    
}
