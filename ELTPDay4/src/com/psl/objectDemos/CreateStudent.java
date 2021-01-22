package com.psl.objectDemos;

public class CreateStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1=new Student(10, "Pankaj");
		Student obj2=new Student(10, "Pankaj");
		if(obj1.equals(obj2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}

}
