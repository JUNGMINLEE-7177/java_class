package ch16.sec01;

public class Anonymous {
public static void main(String[] args) {
		
		// 1. 더하기 연산을 수행하는 익명 구현 객체
		action(new Calculable() {
			@Override
			public void calculate(int x, int y) {
				int result = x + y;
				System.out.println("result: " + result);
			}
		});
		
		// 2. 빼기 연산을 수행하는 익명 구현 객체
		action(new Calculable() {
			@Override
			public void calculate(int x, int y) {
				int result = x - y;
				System.out.println("result: " + result);
			}
		});
	}

	public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		// 데이터 처리 (전달받은 익명 객체의 메소드 호출)
		calculable.calculate(x, y);
	}

}
