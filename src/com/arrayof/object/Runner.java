package com.arrayof.object;

public class Runner {

	public static void main(String[] args) {
		Contact c[]=new Contact[3];
		c[0] = new Contact ("Abdul","7502060003");
		c[1] = new Contact ("Mubi","98765432210");
		c[2] = new Contact ("Rayan","9980251826");
		for (Contact obj:c) {
			System.out.println(obj);
		}
		
	}

}
