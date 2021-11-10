package ControlStatement03;

import java.io.IOException;

public class ifStatement01 {

	public static void main(String[] args) throws IOException {
		/* if - 범위를 가지는 값
		 * 분기문(조건문):프로그램 흐름상 분기하고자 할때 사용하는 제어문
		 * if문/switch문 두가지가 있다.
		 * 
		 * if문 기본 형식 1]
		 * 조건식은 비교식또는 논리식이어야 한다.
		 * 즉 결과값이 true 아니면 false가 나오는 식이거나
		 * 직접 boolea(true,false)을 줄 수 있다
		 * 
		 * if(조건식){//만약(if)조건식이 참이라면(조건식,비교문)
		 *     조건식이 참일때 실행할 명령문;
		 * }
		 * 
		 * 조건식이 참일때 실행할 명령문이 하나면
		 * {}생략가능하다
		 * {}는 실행문들을 하나로 묶는 블락역할을 한다.
		 */
		int num1=10;
		//if(num1%2) {};[x]
		//if(num1) {};[x]
		//조건식은 비교식 아니면 논리식 혹은 boolean 값(true,false)
		if(num1%2==0) { //비교식
			System.out.printf("%d는 짝수%n",num1);
		}
		num1 =9;
		if(num1%2!=0) { //비교식
			System.out.printf("%d는 홀수%n",num1);
		}
		
		if(num1%2!=0 && num1>=9) { //논리식
			System.out.printf("%d는 홀수이고 9보다 크거나 같은 수이다",num1);
		}
		
		if(true) System.out.println("항상 실행되는 명령문");
		if(false) System.out.println("항상 실행이 안되는 명령문");
		//2]if(조건식) ; 는 조건식이 참일때 수행할 명령문이 없음을 의미(조심)
		if(num1%2 !=0);
		{//아래 블락{}은 if문과 전혀 상관없이 실행된다. 즉 위의 if문의 블락이 아니다.
			System.out.printf("%d는 홀수%n",num1);
		}
		
		//3]조건식이 참일때 수행할 명령문이 하나인 경우 {}생략가능
		if(num1%2==0) System.out.printf("%d는 짝수%n",num1);
		
		/*3-1]
		 * 수행할 명령문이 여러개인 경우 {}을 생략하면 의도하지 않은 결과를 초래할 수 있다.
		 * 그러므로 조건식이 참일때 수행할 명령문이 여러개인 경우는 반드시 {}로 묶어라
		 */
		if(num1%2 !=0) {
			System.out.printf("num1은 %d이다%n",num1);
			System.out.printf("%d는 홀수다%n",num1);
		}
		/* System.in.read()메소드:
		 * 사용자 입력을 받을때까지 블락상태가 된다.
		 * 즉, 다음 코드가 실행이 안된다.
		 * 입력한 문자의 아스키 코드값 반환
		 */
		System.out.println("1. 한문자를 입력하세요.");
		int asciiCode = System.in.read();
		System.in.skip(2);
		System.out.println("사용자가 입력한 문자의 아스키 코드값:"+asciiCode);
		System.out.println("사용자가 입력한 문자:"+(char)asciiCode);
		//사용자가 입력한 문자가 숫자인지 아닌지를 판단하자
		//1]아스키 코드값을 알때
		boolean isNumber = asciiCode>=48 && asciiCode <=57;
		if(isNumber) System.out.println("입력한 문자는 숫자입니다.");
		if(!isNumber) System.out.println("입력한 문자는 숫자가 아닙니다.");
		//2]아스키 코드값을 모를때
		isNumber = asciiCode>='0' && asciiCode <='9';
		if(isNumber) System.out.println("입력한 문자는 숫자입니다.");
		if(!isNumber) System.out.println("입력한 문자는 숫자가 아닙니다.");
		
		/*
		 * 문] 사용자가 입력한 문자가 알파벳이거나 숫자면
		 *    "알파벳 혹은 숫자"라고 출력하고
		 *    아니면 "기타"라고 출력 하여라.
		 *    (아스키 코드값 모른다고 가정) else문 불가
		 *    참고로 영문 알파벳의
		 *    아스키 코드값은 대문자A(65)~Z(90), 소문자 a(97)~z(122)
		 */
		System.out.println("1. 한문자를 입력하세요.");
		int var = System.in.read();
		System.in.skip(2);
		boolean i = var>='0'&&var<='9' || var>='A'&&var<='Z' || var>='a'&&var<='z';
		if(i) System.out.println("알파벳 혹은 숫자");
		if(!i) System.out.println("기타");
		
		/*
		 * 문]사용자가 입력한 값이 숫자인지 먼저 판단하고
		 *   숫자라면 2의 배수인지를 판단하여
		 *   2의 배수인 경우만 "2의 배수입니다"라고 줄력하여라.
		 *   2의 배수가 아닌 경우 "2의 배수가 아니다"라고 출력(else문 불가)
		 *   문자 '0'의 아스키 코드값:48
		 *   '1':49 '2':50....
		 */
		System.out.println("1. 한문자를 입력하세요.");
		int word = System.in.read(); System.in.skip(2);
		if(word>='0'&&word<='9') {
			if(word%2==0) System.out.println("2의 배수입니다");
			if(word%2!=0) System.out.println("2의 배수가 아니다");
		}

	}

}
