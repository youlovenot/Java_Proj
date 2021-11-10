package exception_10.custom_Exception.p444;

public class BalanceInsufficientException extends Exception{	//사용자 정의 예외 클래스
	
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);		//Exception 메세지를 입력
	}						//e.getMessage() 메세지 출력

}
