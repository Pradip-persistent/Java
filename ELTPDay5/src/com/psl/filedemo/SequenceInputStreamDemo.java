package com.psl.filedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
public class SequenceInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin1= new FileInputStream("data1.txt");
			FileInputStream fin2=new FileInputStream("data2.txt");
			SequenceInputStream seqStream= new SequenceInputStream(fin1,fin2);
			int ch=0;
			while((ch=seqStream.read())!=-1) {
				System.out.print((char)ch);
			}
			seqStream.close();
			fin1.close();
			fin2.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
