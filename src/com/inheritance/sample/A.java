package com.inheritance.sample;

public class A {
	protected int x;
	protected int y;
	
	public A(int x, int y) {
		this.y = y;
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void sum() {
		System.out.println("inside A class -sum");
		System.out.println(x+y);
	}
	
	

}
