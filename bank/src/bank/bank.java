package bank;

import java.util.Scanner;

public class bank {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run =true;
		int money = 0;
		
		while(run) {
			System.out.println("------------");
			System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4. 종료");
			System.out.println("------------");
			System.out.println("선택: ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				System.out.println("예금 금액을 입력해주세요.");
				String number1 = scanner.nextLine();
				int number2 = Integer.parseInt(number1);
				money = money+number2;
				System.out.println("현재 금액="+money);
			}else if (strNum.equals("2")) {
				System.out.println("출금 금액을 입력해주세요.");
				String number1 = scanner.nextLine();
				int number2 = Integer.parseInt(number1);
				money = money - number2;
				System.out.println("현재 금액="+money);
			}else if(strNum.equals("3")) {
				System.out.println("현재 금액="+money);
			}else {
				run=false;
			}
			
		}
		System.out.println("프로글매 종료");
		
	}

}

