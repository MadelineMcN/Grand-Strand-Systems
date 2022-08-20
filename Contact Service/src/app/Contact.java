package app;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String addressNum;
	private String phoneNum;
	private String contact;
	
	public Contact(String contactId,String fName,String lName,String phone,String address){
		if(contactId.length() <= 10 && contactId != null) {
			this.contact = contactId;
		}
		this.setFirstName(fName);
		this.setLastName(lName);
		this.setPhoneNumber(phone);
		this.setAddress(address);
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber.length() == 10 && phoneNumber != null) {
			this.phoneNum = phoneNumber;
		}
	}

	public void setFirstName(String fName) {
		if(fName.length() <= 10 && fName != null) {
			this.firstName = fName;
		}
	}
	
	public void setLastName(String lName) {
		if(lName.length() <= 10 && lName != null) {
			this.lastName = lName;
		}
	}

	
	public void setAddress(String address) {
		if(address.length() <= 30 && address != null) {
			this.addressNum = address;
		}
	}
	
	public String getPhoneNumber() {
		return phoneNum;
	}
	
	public String getAddress() {
		return addressNum;
	}


	public String getContact() {
		return contact;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}


}
