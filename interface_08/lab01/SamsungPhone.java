package interface_08.lab01;

public class SamsungPhone implements PhoneInterface {	//implements: 인터페이스를 구현하는 클래스

	@Override
	public void sendCall() {			//추상메소드 구현 (오버라이딩)
		System.out.println("띠리리리링");	//구현하는 클래스에서 public 접근제어자 생략하면 오류 발생
	}
	
	@Override
	public void receiveCall() {			//추상메소드 구현 (오버라이딩)
		System.out.println("전화가 왔습니다.");
	}
	public void flash() {				//메소드를 추가 작성
		System.out.println("전화기에 불이 켜졌습니다.");
	}

}
