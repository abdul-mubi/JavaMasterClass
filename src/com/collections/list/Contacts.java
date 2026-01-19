package com.collections.list;

public class Contacts {
	
	private String name;
	private String contactNumber;
	
	public Contacts(String name, String contactNumber) {
		super();
		if (validateContactNumber(contactNumber)) {
			this.name = name;
			this.contactNumber = contactNumber;
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (validateContactNumber(contactNumber)) {
			this.contactNumber = contactNumber;
		}
	}
	
	private boolean validateContactNumber(String contactNumber) {
		if (contactNumber == null || contactNumber.length() !=10 || !contactNumber.matches("\\d{10}")) {
			throw new IllegalArgumentException("Contact number can not be null or more than 10 digit");
		}
		return true;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", contactNumber=" + contactNumber + "]";
	}
	
	

}
