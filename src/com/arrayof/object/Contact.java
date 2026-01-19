package com.arrayof.object;

public class Contact {
	private String name;
	private String contactNmber;

	public Contact(String name, String contactNmber) {
		super();
		if (validateName(name)) {
			this.name = name;
			this.contactNmber = contactNmber;
		}

	}

	private boolean validateName(String name) {
		if (!name.isEmpty() && name != null) {
			return true;
		}else {
			throw new IllegalArgumentException("Name can not be null or empty");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (validateName(name)) {
			this.name = name;
		}
	}

	public String getContactNmber() {
		return contactNmber;
	}

	public void setContactNmber(String contactNmber) {
		this.contactNmber = contactNmber;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", contactNmber=" + contactNmber + "]";
	}

}
