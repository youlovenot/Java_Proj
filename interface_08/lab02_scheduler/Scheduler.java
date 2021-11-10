package interface_08.lab02_scheduler;

public interface Scheduler {	//인터페이스
	
	void getNextCall();			//추상메소드: public abstract 생략됨, 다음 콜을 받아오는 메소드
	void sendCallToAgent();		//추상메소드: public abstract 생략됨, 콜을 에이전트에게 보내는 메소드
}
