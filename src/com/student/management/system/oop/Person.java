package com.student.management.system.oop;

import java.io.Serializable;
import java.util.Objects;

public abstract class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	protected String name;
	protected int age;
	protected String contactNumber;
	protected String address;
	protected static int totalPersonCount;

	public Person(String name, int age, String contactNumber, String address) {
		this.name = name;
		this.age = age;
		this.contactNumber = contactNumber;
		this.address = address;
		totalPersonCount++;
	}

	public int getTotalPersonCount() {
		return totalPersonCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.isEmpty() && validateName(name)) {
			this.name = name;
		} else {
			System.err.println("It is an invalid name, Please provide name with only characters");
		}

	}

	private final boolean validateName(String name) {
		boolean digitNotFound = true;
		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i))) {
				digitNotFound = false;
				break;
			}
		}
		return digitNotFound;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (validateContactNumber(contactNumber)) {
			this.contactNumber = contactNumber;
		} else {
			System.err.println("Provide 10 digit contact number");
		}
	}

	private final boolean validateContactNumber(String contactNumber) {
		if (contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Provide 10 digit contact number");
			return false;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String studentAddress) {
		if (validateAddress(studentAddress)) {
			this.address = studentAddress;
		} else {
			System.err.println("Provide some address value as it is mandatory");
		}
	}

	private final boolean validateAddress(String studentAddress) {
		if (studentAddress.isEmpty()) {
			System.err.println("Provide some address value as it is mandatory");
			return false;
		} else {
			return true;
		}

	}

	protected boolean updateInformation(String newContactNumber, String newAddress) {
		if (validateAddress(newAddress) && validateContactNumber(newContactNumber)) {
			setAddress(newAddress);
			setContactNumber(newContactNumber);
			return true;
		}
		return false;
	}

	protected boolean updateInformation(String newContactNumber) {
		if (validateContactNumber(newContactNumber)) {
			setContactNumber(newContactNumber);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", address=" + address
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, contactNumber, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && age == other.age
				&& Objects.equals(contactNumber, other.contactNumber) && Objects.equals(name, other.name);
	}

}
