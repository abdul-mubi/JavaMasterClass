package com.string;

public class StringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name = "Abdul";
//		System.out.println(name);
//		
//		String name2 = "Abdul";
//		System.out.println(name2);
//		
//		name = name+"123";
//		System.out.println(name);
//		System.out.println(name2);
		
//		String var1 = "Mubi";
//		System.out.println(var1);
//		
//		String var2 = new String ("Mubi");
//		System.out.println(var2);
//		
//		System.out.println(var1.hashCode());
//		System.out.println(var2.hashCode());
//		
//		System.out.println(var1==var2);// eventhough hashcode is same, var1 reference value and var2 reference value are different, 
		//thats why we will get false 
		
//		String data = "   Abdul   ";
//		data = data.trim();
//		System.out.println(data);
//		
//		char car = 'c';
//		String carS = car+"";
//		System.out.println(carS instanceof String);
		
		
//		String obj1 = new String("Abdul");
//		String obj2 = new String("Abdul");
//		
//		System.out.println(obj1 == obj2);
//		System.out.println(obj1.equals(obj2));
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
//		
//		obj1.intern();
//		obj2.intern();
//		
//		System.out.println(obj1 == obj2);
//		System.out.println(obj1.equals(obj2));
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
		
//		String name = "Abdul";
//		String res = name.replace("l","");
//		System.out.println(name);
//		System.out.println(res);
		
		
		System.out.println(validateGivenStringVal("A++"));
		
		

	}
	
	static boolean validateGivenStringVal(String name) {
		boolean digit = false;
		for (int i=0; i<name.length(); i++) {
			if (Character.isDigit(name.charAt(i))) {
				digit = true;
				break;
			}
		}
		return digit;
	}


}
