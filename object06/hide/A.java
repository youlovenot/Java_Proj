package object06.hide;

import object06.hide.p.B;	//객체의 전체이름 : 패키지명.객체명

public class A {
	
	public void a() {
		
		B b =new B();		//다른 패키지안의 객체를 실행하기위해 import사용
//						<< 다른 패키지에 존재하는 클래스 >>
	//	b.p = 10;[x]	//private 접근제한자 접근 불가능
	//	b.m = 20;[x]	//default 접근제한자 접근 불가능
	//	b.k = 30;[x]	//protected 접근제한자 접근 불가능, 만약 상속관계에 있다면 접근이 가능
		b.n = 40;		//public 접근제한자 접근 가능
	}

}
