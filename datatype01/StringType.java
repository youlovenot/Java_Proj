package datatype01;

public class StringType {

	public static void main(String[] args) {
		/*String형: 참조현-기본자료형이 아님
		 * 문자열을 저장할 수 있는 데이타 타입.
		 * 자바에서 문자열을 나타낼때는""(double quotation) 감싼다.
		 * +는 숫자연산에 사용될때는 더하기를 의미한다.
		 * 문자열에 사용될때는 문자열 연결을 의미한다.
		 * 문자열 + 숫자는 문자열이 됨
		 */
		int number; //변수 선언
		number = 99;//변수 초기화
		
		//1]참조형과 기본 자료형 사이에 형변환 불가
		//String strNumber = number;[x] 정수형을 문자열형에 담을 수 없다.
		//int initNum = (int)"100";[x] 형변환이 안됨
		String strNumber1= 99+"";
		String strNumber2= "100";
		
		//숫자 + 문자열 => 99 + "100" =>"99100"
		System.out.println(number+strNumber2);
		
		//2]new 연산자를 사용해서 문자열 저장
		String newString = new String("new 연산자 사용");
		System.out.println(newString);
		String stringLikeBasic = "기본형 자료형처럼 문자열처럼";
		System.out.println(stringLikeBasic);
		
		//3]+가 문자열에 사용될때는 연결을 의미
		String plusString;
		plusString=newString+stringLikeBasic;
		System.out.println(plusString);
		
		int kor = 100, eng = 100, math = 100;
		System.out.println("총점:"+kor+eng+math);//문자열과 숫자를 +로 연결시 문자열이 됨
		System.out.println("총점:"+(kor+eng+math));
		
	}

}
