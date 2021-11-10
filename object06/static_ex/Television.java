package object06.static_ex;

public class Television {
	static String company = "Samsung";	// static변수에 초기값 입력
	static String model = "LCD";		// static변수에 초기값 입력
	static String info;		// static변수에 초기값이 할당이 되지않은 상태
		// static키가 들어가있지 않은 필드는 초기값을 생성자에서 적용
	
	public Television(){}
	
	static {	//static키가 적용된 필드(변수)에 초기값을 할당할때 사용, 초기화 블록
		info = company+"-"+model;
	}

}
