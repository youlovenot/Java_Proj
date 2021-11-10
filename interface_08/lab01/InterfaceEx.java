package interface_08.lab01;

public class InterfaceEx {

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();		//default 메소드 호출 : 인터페이스에서 구현 코드가 적용된 메소드
		phone.sendCall();
		phone.receiveCall();
		phone.flash();		// SamsungPhone에만 존재하는 메소드

		System.out.println("======================");
		//인터페이스는 객체를 생성할 수 없다. 타입 변환은 가능하다.
		//PhoneInterface ph = new PhoneInterface();		//오류 발생
		PhoneInterface ph = new SamsungPhone();			//타입변환은 가능하다.(업캐스팅)
		ph.printLogo();		// default 메소드
		ph.sendCall();		// 오버라이딩
		ph.receiveCall();	// 오버라이딩
		SamsungPhone ss = (SamsungPhone) ph;		//다운캐스팅
		ss.flash();
	}

}
