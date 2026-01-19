package com.file.handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {
		File demo = new File("demo.txt");
		File demo2 = new File("demo2.txt");
		String copiedLine = null;
		try(BufferedReader br = new BufferedReader(new FileReader(demo));
				BufferedWriter bw = new BufferedWriter(new FileWriter(demo2, true))) {

			while ((copiedLine = br.readLine()) != null) {
				bw.write(copiedLine +"\n");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed copied and pasted in new file");
	}

}
