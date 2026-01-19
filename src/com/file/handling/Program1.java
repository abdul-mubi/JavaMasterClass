package com.file.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program1 {
	//Problem state is to give me the total char and total lines in a text file

	public static void main(String[] args) {
		File myFile = new File("demo.txt");
		FileReader fr;
		BufferedReader br;
		String line = "";
		int totalChar = 0;
		int totalLines = 0;
		try {
			fr = new FileReader(myFile);
			br = new BufferedReader(fr);
			while((line = br.readLine()) != null) {
				totalChar = totalChar + line.length();
				totalLines ++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("totalLines is "+totalLines);
		System.out.println("totalChar is "+totalChar);

	}

}
