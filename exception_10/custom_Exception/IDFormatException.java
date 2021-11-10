package exception_10.custom_Exception;	//사용자 정의 Exception

public class IDFormatException extends Exception{
	
	public IDFormatException (String message) {	// 생성자
		super(message);		// 부모 클래스의 생성자를 다시 호출
	}
}
