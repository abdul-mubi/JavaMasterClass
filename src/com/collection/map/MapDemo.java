package com.collection.map;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, String> obj = new HashMap<String, String>();
		obj.put("Abdul","1" );
		obj.put("Mubi","2" );
		obj.put("Rayan","3" );

		System.out.println(obj);
		obj.put("Rayan","4" );
		System.out.println(obj);
		obj.put("Rayan","4" );
		System.out.println(obj);
		obj.put("Rayan","4" );
		System.out.println(obj);
	}

}
