package com.persistent.app;

public class GreeterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeters[]=new Greeter[args.length];
	for(int i=0;i<args.length;i++) {
		greeters[i]=new Greeter(args[i]);
		greeters[i].sayHello();
	}
	Advisor advice=new Advisor();
	System.out.println(advice.getAdvice());
	for(int i=greeters.length-1;i>=0;i--) {
		greeters[i].sayGoodBye();
	}
	}

}
