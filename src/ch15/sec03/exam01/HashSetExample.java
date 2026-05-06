package ch15.sec03.exam01;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		//객체 저장
		set.add("JAVA");
		set.add("JDBC");
		set.add("JAVA");
		
		// 저장된 객체 수 출력
		int size = set.size();
		System.out.println("총 객체 수: " + size);
	}

}
