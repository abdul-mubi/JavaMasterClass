package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
	private List<Contacts> contactList;

	public ContactManager() {
		super();
		contactList = new ArrayList<Contacts>();
	}
	
	public void addContact(Contacts contactReference) {
		contactList.add(contactReference);
		System.out.println("Contact added successfully..!!!");
	}
	
	public void showAllContacts() {
		for (Contacts contact: contactList) {
			System.out.println(contact.getName()+"\t"+contact.getContactNumber());
		}
	}
	
	public void findIndexOfContact(String nameOrNumber) {
		int index = -1;
		for (int i=0; i<contactList.size(); i++) {
			if(contactList.get(i).getName() == nameOrNumber || contactList.get(i).getContactNumber() == nameOrNumber ) {
				index = i;
				break;
			}
		}
		System.out.println("Index is "+index);
	}
	
	
}
