package com.psl.filedemo;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("data.txt");
		if(file.exists()) {
			FileInputStream fin;
			try {
				fin = new FileInputStream(file);
				BufferedInputStream bin=new BufferedInputStream(fin);
				DataInputStream din= new DataInputStream(bin);
				int ch=0;
				try {
					while((ch=din.read())!=-1) {
						System.out.print((char)ch);
					}
					din.close();
					bin.close();
					fin.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	}

}
