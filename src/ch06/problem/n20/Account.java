package ch06.problem.n20;

public class Account {
	private String accountNum;
	private String accountOwner;
	private int balance;
	
	/*
	public Account(String accountNum, String accountOwner, int balance) {
		this.accountNum = accountNum;
		this.accountOwner = accountOwner;
		this.balance = balance;
	}
	*/
	
	
	public void setAccount(String accountNum, String accountOwner, int balance) {
		this.accountNum = accountNum;
		this.accountOwner = accountOwner;
		this.balance = balance;
		
	}
	
	public void modifyBalance(int balance) {
		this.balance += balance;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	
	public String getAccountOwner(){
		return accountOwner;
	}
	
	public int getBalance() {
		return balance;
	}
}	

