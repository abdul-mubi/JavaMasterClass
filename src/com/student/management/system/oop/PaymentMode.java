package com.student.management.system.oop;

public enum PaymentMode {
	CASH ("Payment via cash"),
	UPI ("Payment via upi"),
	CARD ("Payment via card");
	
	private String description;
	
	private PaymentMode(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
