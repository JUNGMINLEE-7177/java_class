package Bank;

import java.util.Scanner;

public class Account {
	
	private String AccountNum;
	private String name;
	private int money;

	Account(String AccountNum, String name, int money){
		this.AccountNum = AccountNum;
		this.name = name;
		this.money = money;
	}
	
	/***
	void setAccount(String AccountNum, String name, int money) {
		this.AccountNum = AccountNum;
		this.name = name;
		this.money = money;
	}
	***/
	
	void AccountList() {
		System.out.println(AccountNum+"   "+name+"   "+money);
	}
	
	void Deposit(int plus) {
		this.money += plus;
	}
	
	void WithDraw(int minus) {
		if (this.money < minus) {
			System.out.println("잔액이 부족합니다.");
		}else {
			this.money -= minus;
		}
	}

	String getAccountNum() {
		return this.AccountNum;

	}


}
