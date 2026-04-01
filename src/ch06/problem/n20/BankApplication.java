package ch06.problem.n20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] account = new Account[100];
	private int num = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			int select = scanner.nextInt();
			System.out.println();
			
			switch (select) {
				case 1 :
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
					
					account[num] = new Account();
					account[num].setAccount(accountNum, accountOwner, balance);
					
			}
			
		}		
	}

}
