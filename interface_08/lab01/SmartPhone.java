package interface_08.lab01;

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	// SmartPhone 클래스는 PDA 클래스를 상속 받고있고ㅡ MobilePhoneInterface, MP3Interface를 구현
	// 다중상속을 허용되지 않는다. (자식은 하나의 부모클래스만 가진다.)
	// 인터페이스 다중상속은 허용된다.
	
	@Override
	public void sendCall() {	//Phone Interface에서 선언해 놓은 메소드 (상속)
		System.out.println("따르릉 따르릉~~~");
	}

	@Override
	public void receiveCall() {	//Phone Interface에서 선언해 놓은 메소드 (상속)
		System.out.println("전화 왔어요");
	}

	@Override
	public void play() {	//MP3Iterface
		System.out.println("음악 연주 합니다.");
	}

	@Override
	public void stop() {	//MP3Iterface
		System.out.println("음악을 중단 합니다.");
	}

	@Override
	public void sendSMS() {		//MobilePhoneUnterface
		System.out.println("문자 갑니다.");
	}

	@Override
	public void receiveSMS() {	//MobilePhoneUnterface
		System.out.println("문자 왔어요.");
	}
	
	public void schedule() {	//추가로 작성한 메소드
		System.out.println("일정 관리 합니다.");
	}
	
}
