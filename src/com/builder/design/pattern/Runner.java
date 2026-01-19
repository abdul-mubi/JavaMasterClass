package com.builder.design.pattern;

import com.builder.design.pattern.Emp.Builder;

public class Runner {

	public static void main(String[] args) {
		
		Emp e2 = new Emp.Builder().name("Mubi").empId(102).salary(2000).build();
		System.out.println(e2.toString());
		
		Builder b1 = new Emp.Builder();
		System.out.println(b1.name("Abdul1").toString());
		Emp e3 = b1.build();
		System.out.println(e3.toString());
		b1.name("UpdatedAbdul");
		System.out.println(b1.toString());
		
		
		Emp e4 = b1.build();
		System.out.println(e4.toString());
		
		
		
	}

}
