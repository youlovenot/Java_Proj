package interface_08;

public interface PhoneInterface {	//인터페이스 : 클라이언트가 회사내부의 서버 서비스를 사용할 수 있는 접점
							//인터페이스 내에 상수, 추상메소드 : JVM 7.0
							//인터페이스 내에 상수, 추상메소드, default 메소드 : JVM 8.0 [=1.8]
							//변수는 인터페이스에서 올수 없다. 객체를 생성할 수 없다.
							//인터페이스 내에서 구현 코드가 사용된 메소드
								// default 메소드 (8.0) : 상속, 하위 클래스에서 별도로 선언
								// static 메소드
								// private 메소드 : 상속(X), 인터페이스 내에서만 사용.
	public static final int timeout = 10000;
	public abstract void sendCall ();
	public abstract void recieveCall();
	public default void printLogo() {
		System.out.println("로고를 프린트 합니다.");
	}
}
