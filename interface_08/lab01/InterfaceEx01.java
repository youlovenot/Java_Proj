package interface_08.lab01;

public class InterfaceEx01 {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();		// default 메소드 : PhoneInterface에서 선언된 메소드 (상속)
		phone.sendCall();		// 오버라이딩 (phoneInterface 선언)
		phone.play();			// 오버라이딩 (MP3Interface 선언)
		System.out.println("3과 5를 더하면 : "+phone.calculate(3, 5));	//PDA클래스에서 상속
		phone.schedule();		// SmartPhone에서 추가된 메소드
	}

}
