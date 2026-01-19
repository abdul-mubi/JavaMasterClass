package com.collections.list;

public class ContactRunner {

	public static void main(String[] args) {
		Contacts obj = new Contacts("Abdul", "7502060003");
		
		
		ContactManager cm = new ContactManager();
		cm.addContact(obj);
		cm.showAllContacts();
		cm.findIndexOfContact("7502067003");

	}

}
