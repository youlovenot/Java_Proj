package basic_class_11.object;

public class B //[extebds Object] <== 생략되어 있다. 컴파일 시에 컴파일러가 자동으로 삽입
	{		// Java의 모든 클래스는 Object 클래스를 상속 받는다. 
			// import java.lang.Object
			// java.lang.*		<== 자동으로 임포트됨. 컴파일시에 컴파일러가 자동으로 import한다.
	
	B() {}			// 기본 생성자 = 다른 생성자가 없을때 생략가능
	int a = 1;
	void b() {
		System.out.println( a );
	}

	public static void main(String[] args) {
		
		B b = new B();
		
		Object c = b;		//Object 타입으로 업캐스팅
		B d = (B) c;		//다운 캐스팅
		
		b.a =10;			// B Class
		b.b();				// B Class
		
		b.toString();		// Object 클래스의 메소드

	}

}
