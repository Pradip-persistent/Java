package com.psl.filedemo;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReaderFile {
	public static void main(String args[]) {
		File file=new File("data.txt");
		if(file.exists()) {
			try {
				FileReader reader=new FileReader(file);
				BufferedReader brReader=new BufferedReader(reader);
				int ch=0;
			
				while((ch=brReader.read())!=-1) {
					System.out.print((char)ch);
				}
				brReader.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
