package com.psl.exceptionDemos;

public class Bank {
	int accNo;
	double  Balance;
	static int number=1; //auto gen acc no
	public Bank(double balance) {
		super();
		Balance = balance;
		accNo=number++;
	}
	public void withdraw(int amt) {
		if(amt<=Balance) {
			Balance-=amt;
		}
		else
		throw new AccountException("in-sufficient balance");
	}
	public void deposite(int amt) {
		Balance+=amt;
	}


}
