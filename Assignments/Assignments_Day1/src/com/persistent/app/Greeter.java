package com.persistent.app;

public class Greeter {
		String name;
		public Greeter(String aName) {
			// TODO Auto-generated constructor stub
			this.name=aName;
		}
		void sayHello() {
			System.out.println("hello "+name);
		}
		void sayGoodBye() {
			System.out.println("Good Bye "+name);
		}
	

}
