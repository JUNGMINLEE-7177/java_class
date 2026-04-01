package ch06.problem.n20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private int num = 0;
	public static void main(String[] args) {
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			
			int select = scanner.nextInt();
			System.out.println();
			
			switch (select) {
				case 1 :
			}

			
		}		
	}
	
	//계좌생성
	private static void createAccount(){
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		
		System.out.print("계좌번호: ");
		String accountNum = scanner.nextLine();
		System.out.println();
		
		System.out.print("계좌주: ");
		String accountOwner = scanner.nextLine();
		System.out.println();
		
		System.out.print("초기금액: ");
		int balance = scanner.nextInt();
		System.out.println();
		
		Account account = new Account(accountNum, accountOwner, balance);
		

		
		}
	}


