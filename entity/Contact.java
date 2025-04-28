package entity;

public class Contact implements Comparable<Contact> {
	//entity class
	private String name;
    private long phoneNumber;
    private String email;
	
    
    public Contact(String name, long phoneNumber, String email) {
		this(name,phoneNumber);
		this.email = email;
	}
    // constructor overloading
    public Contact(String name, long phoneNumber) {
		
		this.name = name;
		this.phoneNumber = phoneNumber;
	}


	public String getName() {
		return name;
	}
	@Override
    public int compareTo(Contact other) {
        return this.name.compareToIgnoreCase(other.name); // Sort alphabetically, ignoring case
    }


	
	public void setName(String name) {
		this.name = name;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
    

}
