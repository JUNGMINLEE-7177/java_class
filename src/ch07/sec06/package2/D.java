package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A{
	//생성자 선언
	public D() {
		//A()생성자 호출
		super();
	}
	
	//메소드 선언
	public void method() {
		//A필드값 변경
		this.field="value";	//o	(protected는 상속을 통해서만 사용 가능)
		//A메소드 호출
		this.method();		//o (protected는 상속을 통해서만 사용 가능)
	}
	
	//메소드 선언
	public void method2() {
		A a = new A();
		a.field="value";
		a.method();
	}

}
