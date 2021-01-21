package com.persistent.app;

public class Advisor {
	String[] advices=new String[5];
	public Advisor() {
		// TODO Auto-generated constructor stub
		advices[0]="Never Say no";
		advices[1]="Never Quite";
		advices[2]="Be Positive";
		advices[3]="Everything is Possible";
		advices[3]="Go in depth";
		
	}
	String getAdvice() {
		return advices[(int) (Math.random()*2)%5];
	}

}
