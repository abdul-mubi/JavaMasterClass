package com.student.management.system.oop;

public class PayableRunner {

	public static void main(String[] args) {
		Payable payable = new TuitionFee(100, 10, 10);
		System.out.println("Final amount need to pay is "+payable.calculatePayment());
		payable.processPayment(PaymentMode.CARD);
		System.out.println(PaymentMode.CARD.getDescription());
		payable.generateReceipt();
		System.out.println("Overall discount provided "+payable.getDiscount());
		System.out.println("---------------------------------------------------");
		Payable payable2 = new SportsActivityFee(100, 100, 100, 10);
		System.out.println("Final amount need to pay is "+payable2.calculatePayment());
		payable.processPayment(PaymentMode.CASH);
		System.out.println(PaymentMode.CASH.getDescription());
		payable2.generateReceipt();
		System.out.println("Overall discount provided "+payable2.getDiscount());
		System.out.println("---------------------------------------------------");
		System.out.println(PaymentMode.valueOf("CC"));
		
	}

}
