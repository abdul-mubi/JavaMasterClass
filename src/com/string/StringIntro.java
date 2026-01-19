package com.string;

public class StringIntro {
	private String name;
	private static String comName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringIntro obj = new StringIntro();
		System.out.println(obj.name);
		System.out.println(StringIntro.comName);
		obj.name = "Abdul";
		StringIntro.comName = "company name";
		System.out.println(obj.name);
		System.out.println(StringIntro.comName);
		
		System.out.println("=========================");
		
		obj.method1();
		
		System.out.println("=========================");
		System.out.println(obj.name);
		System.out.println(StringIntro.comName);
		
		StringIntro obj2 = new StringIntro();
		System.out.println(obj2.name);
		obj2.method1();
		System.out.println(obj2.name);

	}
	
	public void method1() {
		name = "Mubi";
		this.comName = "new comapny name";
		
		System.out.println(this.name);
		System.out.println(this.comName);
	}


}
