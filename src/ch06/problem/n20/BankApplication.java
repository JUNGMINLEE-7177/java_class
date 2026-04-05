package ch06.problem.n20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private int num = 0;
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			
			int select = scanner.nextInt();
			scanner.nextLine();
			
			switch (select) {
				case 1 :
					createAccount();
					break;
				case 2 :
					accountList();
					break;
				case 3 :
					deposits();
					break;
				case 4 :
					withdraw();
					break;
				case 5 :
					run = false;
					break;

			}
		}	
	System.out.println("프로그램 종료");
	}
	
	//계좌생성
	private static void createAccount(){
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		
		System.out.print("계좌번호: ");
		String accountNum = scanner.nextLine();
		
		System.out.print("계좌주: ");
		String accountOwner = scanner.nextLine();
		
		System.out.print("초기금액: ");
		int balance = scanner.nextInt();
		scanner.nextLine();
		
		//Account account = new Account(accountNum, accountOwner, balance);
		
		Account account = new Account();
		account.setAccount(accountNum, accountOwner, balance);
		
		for (int i = 0 ; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌목록
	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		for (int i = 0 ; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}
			System.out.println(accountArray[i].getAccountNum()+"   "+accountArray[i].getAccountOwner()+"   "+accountArray[i].getBalance());
		}
	}
	
	//예금
	private static void deposits() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String accountNum = scanner.nextLine();
		System.out.println("예금액: ");
		int depositBalance = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0 ; i < accountArray.length; i++) {
			if (accountArray[i] == null) break;
			if ( accountArray[i].getAccountNum().equals(accountNum)) {
				accountArray[i].modifyBalance(depositBalance);
				break;
			}
			
		}
		
	}
	
	//출금
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		String accountNum = scanner.nextLine();
		System.out.println("출금액: ");
		int depositBalance = -scanner.nextInt();
		scanner.nextLine();
		for (int i = 0 ; i < accountArray.length; i++) {
			if (accountArray[i] == null) break;
			if ( accountArray[i].getAccountNum().equals(accountNum)) {
				accountArray[i].modifyBalance(depositBalance);
				break;
			}
			
		}
		
	}
}


