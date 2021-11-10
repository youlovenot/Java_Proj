package object06.hide.p;

public class C {
	
	public void c() {
		
		B b =new B();
//						<< 같은 패키지에 존재하는 클래스 >>
	//	b.p = 10;[x]	//private 접근제한자 접근 불가능
		b.m = 20;		//default 접근제한자 접근 가능
		b.k = 30;		//protected 접근제한자 접근 가능
		b.n = 40;		//public 접근제한자 접근 가능

	}

}
