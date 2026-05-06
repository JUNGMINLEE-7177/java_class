package ch16.sec02.exam02;
//9.6에서 실습한 익명 구현 객체의 예제를 수정

public class Button {
	//정적 멤버 인터페이스
	@FunctionalInterface
	public static interface ClickListener{
		//추상 메소드
		void onClick();
	}
	
	//필드
	private ClickListener clickListener;
	
	//메소드
	public void setClickListener(ClickListener clickListenr) {
		this.clickListener = clickListener;		
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
