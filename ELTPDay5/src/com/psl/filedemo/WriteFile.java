package com.psl.filedemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		File fil=new File("data.txt");
		if (fil.exists()) {
			System.out.println("Already Exists");
		} else
			try {
				if(fil.createNewFile()) {
					FileWriter writer= new FileWriter(fil);
					BufferedWriter bWriter=new BufferedWriter(writer);
					bWriter.write("Hello File writer");
					bWriter.flush();
					bWriter.close();
					System.out.println("created");
					
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

