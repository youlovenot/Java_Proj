package interface_08.lab04;

public interface Calc {
	double PI = 3.14;				// 상수
	int ERROR = -9999999;
	
	int add (int num1, int num2);				// 추상 메소드
	int substract (int num1, int num2);
	int times (int num1, int num2);
	int divide (int num1, int num2);
	
	//인터페이스에서 구현코드가 있는 메소드
		//default 메소드: 상속(o)
		//static 메소드: stack 영역 저장, 객체 생성없이 사용.
		//private 메소드: 클래스 내부에서만 사용. 상속(x)
		//private static 메소드: 클래스 내부에서만 사용. 상속(x), stack공간에서만 사용
	
	default void description() {	//Java 8.0부터 지원
		System.out.println("정수 계산기를 구현 합니다.");
		myMethod();			// private 메소드 호출
	}
	static int total (int[] arr) {		//static 메소드: 객체생성없이 사용할 수 있는 메소드
		int total = 0;
		for(int i:arr)
			total+=i;
		myStaticMethod();
		return total;
	}
	private void myMethod () {		//Java 9.0부터 지원
		System.out.println("Private 메소드 입니다.");
	}
	private static void myStaticMethod() {			//Java 9.0부터 지원
		System.out.println("Private static 메소드 입니다.");
	}
}
