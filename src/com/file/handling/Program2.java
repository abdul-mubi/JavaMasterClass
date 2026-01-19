package com.file.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {
		File myFile = new File("demo.txt");
		FileReader fr;
		BufferedReader br;
		int longestStringSize = 0;
		String longestStringValue = null;
		String line;
		try {
			fr = new FileReader(myFile);
			br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				String[] words = line.split(" ");
				for (String word : words) {
					if (word.length() > longestStringSize) {
						longestStringSize = word.length();
						longestStringValue = word;
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("longestStringValue is "+longestStringValue);

	}

}
