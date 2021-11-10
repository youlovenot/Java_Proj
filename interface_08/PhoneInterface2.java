package interface_08;

public interface PhoneInterface2 {	// 인터페이스는 상수와 추상메소드,default메소드 <== 변수는 올수 없다.
									// 인터페이스 내에서는 접근제한자가 생략되면 : << public >>
									// 외부의 사용자들이 내부 시스템에 접근 : public

	int timeout = 10000;	// 상수 : 생략가능:	public static final
	void sendCall();		// 추상메소드:		public abstract
	void recieveCall();		//				public abstract
	default void printLogo() {			//	default 메소드: 인터페이스에서 구현부가 있는 메소드
		System.out.println("로고를 프린트 합니다.");
	}
}
