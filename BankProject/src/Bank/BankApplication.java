package Bank;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run =true;
		Account[] Account = new Account[100];
		int num=0;
		
		while(run) {
			System.out.println("------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3.예금 | 4. 출금 | 5. 종료");
			System.out.println("------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				System.out.println("------------");
				System.out.println("계좌생성");
				System.out.println("------------");
				System.out.println("계좌번호: ");
				String AccountNum = scanner.nextLine();
				System.out.println("계좌주: ");
				String name = scanner.nextLine();
				System.out.println("초기입금금액: ");
				String money1 = scanner.nextLine();
				int money2 = Integer.parseInt(money1);
				Account[num++]=new Account(AccountNum,name,money2);
				/***
				Account[num++]=new Account();
				Account.setAccount(AccountNum, name, money2);
				***/
				
			}else if (strNum.equals("2")) {
				System.out.println("------------");
				System.out.println("계좌목록.");
				System.out.println("------------");
				for (int i=0; i<num; i++) {
					Account[i].AccountList();
					}
			}else if(strNum.equals("3")) {
				System.out.println("------------");
				System.out.println("예금.");
				System.out.println("------------");
				System.out.println("계좌번호: ");
				String AccountNum = scanner.nextLine();
				int i;
				for (i=0 ; i<num; i++) {
					if (Account[i].getAccountNum().equals(AccountNum)) {
						break;
					}
				}
				if (i==num) {
					System.out.println("계좌가 없습니다.");
				}else {
					System.out.println("예금액: ");
					String plus1 = scanner.nextLine();
					int plus2 = Integer.parseInt(plus1);
					Account[i].Deposit(plus2);
				}			
			
			}else if(strNum.equals("4")) {
				System.out.println("------------");
				System.out.println("출금.");
				System.out.println("------------");
				System.out.println("계좌번호: ");
				String AccountNum = scanner.nextLine();
				int i;
				for (i=0 ; i<num; i++) {
					if (Account[i].getAccountNum().equals(AccountNum)) {
						break;
					}
				}
				if (i==num) {
					System.out.println("계좌가 없습니다.");
				}else {
					System.out.println("출금액: ");
					String minus1 = scanner.nextLine();
					int minus2 = Integer.parseInt(minus1);
					Account[i].WithDraw(minus2);
				}			
				
			}else {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
		
	
