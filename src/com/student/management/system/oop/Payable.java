package com.student.management.system.oop;

public interface Payable {
	
	public abstract double calculatePayment();
	public abstract void generateReceipt();
	public abstract double getDiscount();

	
	public default boolean processPayment(PaymentMode paymentMode) {
		if(paymentMode == PaymentMode.CARD || paymentMode == PaymentMode.UPI || paymentMode == PaymentMode.CASH) {
			System.out.println("Payment completed");
			return true;
		}else {
			System.err.println("Payment failed");
			return false;
		}
	}
}
