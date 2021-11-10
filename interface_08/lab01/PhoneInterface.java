package interface_08.lab01;

public interface PhoneInterface {	//인터페이스 : 상수 + 추상메소드 + default 메소드(구현코드)
	int TIMEOUT = 10000;		// 상수 : public static final 생략됨
	void sendCall();			// 추상메소드 : public abstract 생략됨
	void receiveCall();			// 추상메소드
	default void printLogo() {	// default 메소드: public 이 생략됨, 하위클래스에 적용
		System.out.println("로고를 프린트 합니다.");
	}
}
