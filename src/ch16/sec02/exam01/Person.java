package ch16.sec02.exam01;

public class Person {
	public void action(Workable workable) {
		workable.work();
		//action매소드 매개변수로 Runnable runnable을 넣고 내부 메서드로 runnable.run();을 만들면 Runnable 인터페이스를 생성할 필요가 없음
	}

}
