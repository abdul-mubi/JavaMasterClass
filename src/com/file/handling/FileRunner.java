package com.file.handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileRunner {

	public static void main(String[] args) {
		File file = new File("demo.txt");
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
//		System.out.println(file.canRead());
//		System.out.println(file.canWrite());
//		System.out.println(file.canExecute());
//		System.out.println(file.length());
//		System.out.println(file.getParent());
//		
		
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write("Abdul\n");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
