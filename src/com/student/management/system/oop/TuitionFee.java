package com.student.management.system.oop;

public class TuitionFee implements Payable{
	private final double baseFee;
	private final double scholarshipDeduction;
	private final double earlyPaymentDiscount;
	private double finalFeesAmount;
	

	public TuitionFee(double baseFee, double scholarshipDeduction, double earlyPaymentDiscount) {
		super();
		this.baseFee = baseFee;
		this.scholarshipDeduction = scholarshipDeduction;
		this.earlyPaymentDiscount = earlyPaymentDiscount;
	}

	@Override
	public double calculatePayment() {
		finalFeesAmount = baseFee-scholarshipDeduction-earlyPaymentDiscount;
		return finalFeesAmount;
	}


	@Override
	public void generateReceipt() {
		System.out.println("Receipt is generated \nFinal amount paid is "+finalFeesAmount);
		
	}

	@Override
	public double getDiscount() {
		return scholarshipDeduction+earlyPaymentDiscount;
	}
	

}
