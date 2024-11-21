package com.constructors;
class BankAccount{
	private int accNumber;
	private int passWd;
	
	BankAccount(int accNumber,int passwd){
		this.accNumber=accNumber;
		this.passWd=passwd;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public int getPassWd() {
		return passWd;
	}
		
}

public class Day01 {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount(3333,8989);
		System.out.println(ba.getAccNumber());
		System.out.println(ba.getPassWd());
	}

}
