package interface_08.lab01;

public interface MobilePhoneInterface extends PhoneInterface {
			//interface가 interface를 상속 : extends
	
	//void sendCall();		//상속으로 내려옴
	//void receiveCall();	//상속으로 내려옴
	void sendSMS();			//추상 메소드
	void receiveSMS();		//추상 메소드

}
