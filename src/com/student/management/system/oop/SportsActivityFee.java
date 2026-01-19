package com.student.management.system.oop;

public class SportsActivityFee implements Payable{
	private final double equipementCharge;
	private final double tournamentFee;
	private final double teamUniformCost;
	private final double discountForStatePlayer;
	private double finalFeeAmount;
	
	public SportsActivityFee(double equipementCharge, double tournamentFee, double teamUniformCost,
			double discountForStatePlayer) {
		super();
		this.equipementCharge = equipementCharge;
		this.tournamentFee = tournamentFee;
		this.teamUniformCost = teamUniformCost;
		this.discountForStatePlayer = discountForStatePlayer;
	}
	@Override
	public double calculatePayment() {
		finalFeeAmount = equipementCharge + tournamentFee + teamUniformCost - discountForStatePlayer;
		return finalFeeAmount;
	}
	
	@Override
	public void generateReceipt() {
		System.out.println("Receipt is generated \nFinal amount paid is "+finalFeeAmount);
		
	}
	@Override
	public double getDiscount() {
		return discountForStatePlayer;
	}
	
	

}
