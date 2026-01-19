package com.inheritance.sample;

public class C extends A{
	
	private int z;
	
	public C(int x, int y, int z){
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void sum() {
		System.out.println(x);
		System.out.println(x+y+z);
	}

}
