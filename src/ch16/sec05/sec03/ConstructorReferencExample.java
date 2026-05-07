package ch16.sec05.sec03;

public class ConstructorReferencExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		//Member m1 = person.getMember1(Member :: new);
		Member m1 = person.getMember1((id) -> { 
		    return new Member(id);});
		/*
		 // 1. getMember1: 익명 구현 객체 방식
        Member m1 = person.getMember1(new Creatable1() {
            @Override
            public Member create(String id) {
                return new Member(id); // 이 부분이 Member::new 또는 id -> new Member(id)가 되는 것
            }
        });
		  */
		
		System.out.println(m1);
		System.out.println();
		
		Member m2 = person.getMember2(Member :: new);
		System.out.println(m2);
		System.out.println();
	}


}
