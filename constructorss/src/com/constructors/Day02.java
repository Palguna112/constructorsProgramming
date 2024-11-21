package com.constructors;
class BankAccounts{
	private int accNumber;
	private int passWd;
	BankAccounts(int accNumber,int passWd){
		this.accNumber=accNumber;
		this.passWd=passWd;
	}
	BankAccounts(){
		System.out.println("Constructor is executing");
	}
	public int getAccNumber() {
		return accNumber;
	}
	public int getPassWd() {
		return passWd;
	}
}
public class Day02 {

	public static void main(String[] args) {
		BankAccounts ba1=new BankAccounts(3333,8989);
		System.out.println(ba1.getAccNumber());
		System.out.println(ba1.getPassWd());
		
		BankAccounts ba2=new BankAccounts();
		System.out.println(ba2.getAccNumber());
		System.out.println(ba2.getPassWd());
	}

}
