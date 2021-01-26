package com.psl.exceptionDemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedUncheckeddemos {
	public static void Main(String args[]) {
		try {
			FileInputStream fileInS= new FileInputStream("d:/data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
