package ch06.sec08.exam02;

class Computer {
	// ...은 가변길이 매개변수를 갖는 매소드 선언
	// values라는 이름의 행렬을 가짐
	int sum(int ...values) {
		int sum=0;
		
		for(int i=0; i<values.length;i++) {
			sum+=values[i];
		}
		
		return sum;
	}

}
